import bill.BillType;
import bill.parser.BillParser;
import bill.parser.PdfBillParser;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String args[]) {
        try {
            String sourceDirURI = "C:\\Users\\igak0913\\projects\\PdfBillRenamer\\bills";
            Path sourceDirPath = Paths.get(sourceDirURI);
            Path dstDirPath = Paths.get(sourceDirURI, "result");
            Files.createDirectories(dstDirPath);
            List<File> files = Files.list(sourceDirPath)
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".pdf"))
                    .map(Path::toFile)
                    .collect(Collectors.toList());
            for (File file : files) {
                BillParser parser = new PdfBillParser(file);
                BillType currentBillType = null;
                for (BillType billType : BillType.values()) {
                    if (parser.contains(billType.getKeyString())) {
                        currentBillType = billType;
                        break;
                    }
                }
                if (currentBillType == null) {
                    throw new ParseException(String.format("Unrecognized BillType in file: %s", file.getName()), 0);
                }
                String newName = currentBillType.getNameBuilder().buildName(parser);
                System.out.println(String.format("%s-> %s",
                        file.getName(), newName));
                Files.copy(file.toPath(), dstDirPath.resolve(newName), StandardCopyOption.REPLACE_EXISTING);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
