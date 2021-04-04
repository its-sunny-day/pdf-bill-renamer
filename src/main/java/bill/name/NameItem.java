package bill.name;

import bill.BillKeyword;

public class NameItem {
    private String itemPrefix;
    private String sectionPrefix = null;
    private CheckedFunction<String, String> converter = null;


    public NameItem(BillKeyword itemPrefix) {
        this.itemPrefix = itemPrefix.getOriginalPhrase();
    }

    public NameItem(BillKeyword itemPrefix, CheckedFunction<String, String> converter) {
        this.itemPrefix = itemPrefix.getOriginalPhrase();
        this.converter = converter;
    }

    public NameItem(BillKeyword itemPrefix, BillKeyword sectionPrefix) {
        this.itemPrefix = itemPrefix.getOriginalPhrase();
        this.sectionPrefix = sectionPrefix.getOriginalPhrase();
    }

    public NameItem(BillKeyword itemPrefix, BillKeyword sectionPrefix, CheckedFunction<String, String> converter) {
        this.itemPrefix = itemPrefix.getOriginalPhrase();
        this.sectionPrefix = sectionPrefix.getOriginalPhrase();
        this.converter = converter;
    }

    public String getItemPrefix() {
        return itemPrefix;
    }

    public String getSectionPrefix() {
        return sectionPrefix;
    }

    public CheckedFunction<String, String> getConverter() {
        return converter;
    }
}
