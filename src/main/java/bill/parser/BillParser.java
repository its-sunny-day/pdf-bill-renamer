package bill.parser;

import java.io.File;
import java.text.ParseException;

public interface BillParser {
     String findItemByPrefix(String itemPrefix, String sectionPrefix) throws ParseException;
     boolean contains(String substring);
     String getFileExtension();
     File getFile();
}
