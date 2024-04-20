package bill.parser;

import org.apache.commons.lang3.StringUtils;
import org.apache.pdfbox.io.RandomAccessReadMemoryMappedFile;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PdfBillParser implements BillParser {
    String parsedFileText;
    File file;

    public PdfBillParser(String fileName) throws IOException {
        File file = new File(fileName);
        this.init(file);
    }

    public PdfBillParser(File file) throws IOException {
        this.init(file);
    }

    private void init(File file) throws IOException {
        this.file = file;
        PDDocument pdDoc = null;
        try {
            PDFParser parser = new PDFParser(new RandomAccessReadMemoryMappedFile(file));
            pdDoc = parser.parse();
            PDFTextStripper pdfStripper = new PDFTextStripper();
            parsedFileText = pdfStripper.getText(pdDoc);
//            System.out.println(parsedFileText);
        } finally {
            if (pdDoc != null)
                pdDoc.close();
        }
    }

    @Override
    public String findItemByPrefix(String itemPrefix, String sectionPrefix) {
        if (StringUtils.isEmpty(this.parsedFileText)) {
            throw new IllegalStateException("parsedFileText is empty...");
        }
        //.*? - allow (optionally) any characters before
        String pattern = ".*?" + itemPrefix + "[\\r\\n\\s]+([A-z0-9.]+).*";
        if (sectionPrefix != null) {
            //[\S\s] - any character includes newline (dot '.' is all characters exclude newline)
            pattern = "[\\S\\s]*?" + sectionPrefix + "[\\S\\s]*?" + itemPrefix + "[\\r\\n\\s]+([A-z0-9.]+).*";
        }
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(this.parsedFileText);
        if (m.find()) {
            return m.group(1);
        }
        return null;
    }

    @Override
    public boolean contains(String substring) {
        if (StringUtils.isEmpty(this.parsedFileText)) {
            throw new IllegalStateException("parsedFileText is empty...");
        }
        return this.parsedFileText.contains(substring);
    }

    @Override
    public String getFileExtension() {
        return "pdf";
    }

    @Override
    public File getFile() {
        return this.file;
    }
}
