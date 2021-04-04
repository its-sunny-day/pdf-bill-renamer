package bill.name;

import bill.parser.BillParser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class NameBuilder {
    private List<Object> items = new ArrayList<Object>();

    public NameBuilder addItem(String txt) {
        this.items.add(txt);
        return this;
    }

    public NameBuilder addItem(NameItem i) {
        this.items.add(i);
        return this;
    }

    protected static Calendar dateToCalendar(String dateString) throws ParseException {
        Date date = new SimpleDateFormat("dd.MM.yyyy").parse(dateString);
        // Choose time zone in which you want to interpret your Date
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Kiev"));
        cal.setTime(date);
        return cal;
    }
    public static String dateToYear(String dateString) throws ParseException {
        return String.format("%02d", dateToCalendar(dateString).get(Calendar.YEAR));
    }

    public static String dateToMonth(String dateString) throws ParseException {
        return String.format("%02d", dateToCalendar(dateString).get(Calendar.MONTH) + 1);
    }

    public static String dateToDay(String dateString) throws ParseException {
        return String.format("%02d", dateToCalendar(dateString).get(Calendar.DAY_OF_MONTH));
    }

    public String buildName(BillParser parser) throws Exception {
        StringBuilder result = new StringBuilder();
        for (Object item : this.items) {
            if (item instanceof NameItem) {
                NameItem i = (NameItem) item;
                String strItem = parser.findItemByPrefix(i.getItemPrefix(), i.getSectionPrefix());
                if (i.getConverter() != null) {
                    strItem = i.getConverter().apply(strItem);
                }
                result.append(strItem);
            } else {
                result.append(item.toString());
            }
        }
        result.append(".").append(parser.getFileExtension());
        return result.toString();
    }
}
