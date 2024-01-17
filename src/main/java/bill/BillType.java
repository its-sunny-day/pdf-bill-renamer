package bill;

import bill.name.NameBuilder;
import bill.name.NameItem;

import static bill.BillKeyword.*;

public enum BillType {
    GARBAGE_COLLECTION(
            BillKeyword.GARBAGE_COLLECTION.getOriginalPhrase(),
            new NameBuilder()
                    .addItem("Вивезення_Відходів_")
                    .addItem(new NameItem(PAID, NameBuilder::dateToYear))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToMonth))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToDay))
    ),
    HOUSEHOLD(
            BillKeyword.HOUSEHOLD.getOriginalPhrase(),
            new NameBuilder()
                    .addItem("Утримання_будинків_")
                    .addItem(new NameItem(PAID, NameBuilder::dateToYear))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToMonth))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToDay))
    ),
    HOT_WATER_SUPPLY(
            BillKeyword.HOT_WATER_SUPPLY.getOriginalPhrase(),
            new NameBuilder()
                    .addItem("ГВП_")
                    .addItem(new NameItem(PAID, NameBuilder::dateToYear))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToMonth))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToDay))
    ),
    COLD_WATER_SUPPLY(
            BillKeyword.COLD_WATER_SUPPLY.getOriginalPhrase(),
            new NameBuilder()
                    .addItem("ХВП_")
                    .addItem(new NameItem(PAID, NameBuilder::dateToYear))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToMonth))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToDay))
    ),
    HOT_WATER_DRAINAGE(
            BillKeyword.HOT_WATER_DRAINAGE.getOriginalPhrase(),
            new NameBuilder()
                    .addItem("ВГВ_")
                    .addItem(new NameItem(PAID, NameBuilder::dateToYear))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToMonth))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToDay))
    ),
    ELECTRICITY_SUPPLY(
            BillKeyword.ELECTRICITY_SUPPLY.getOriginalPhrase(),
            new NameBuilder()
                    .addItem("Електоренергія_")
                    .addItem(new NameItem(PAID, NameBuilder::dateToYear))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToMonth))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToDay))
    ),
    CENTRAL_HEATING(
            BillKeyword.CENTRAL_HEATING.getOriginalPhrase(),
            new NameBuilder()
                    .addItem("ЦО_")
                    .addItem(new NameItem(PAID, NameBuilder::dateToYear))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToMonth))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToDay))
    ),
    CENTRAL_HEATING_CONTRIBUTIONS(
            BillKeyword.CENTRAL_HEATING_CONTRIBUTIONS.getOriginalPhrase(),
            new NameBuilder()
                    .addItem("ЦО_Внески_")
                    .addItem(new NameItem(PAID, NameBuilder::dateToYear))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToMonth))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToDay))
    ),
    INTERNET_EASYPAY(
            BillKeyword.INTERNET_COMPANY_RU.getOriginalPhrase(),
            new NameBuilder()
                    .addItem("Інтернет_")
                    .addItem(new NameItem(INTERNET_PAY_DATE, NameBuilder::dateToYear))
                    .addItem(".")
                    .addItem(new NameItem(INTERNET_PAY_DATE, NameBuilder::dateToMonth))
                    .addItem(".")
                    .addItem(new NameItem(INTERNET_PAY_DATE, NameBuilder::dateToDay))
    ),
    INTERNET_O3_MONOBANK(
            BillKeyword.INTERNET_COMPANY_O3_ENG.getOriginalPhrase(),
            new NameBuilder()
                    .addItem("Інтернет_O3_")
                    .addItem(new NameItem(PAID, NameBuilder::dateToYear))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToMonth))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToDay))
    ),
    INTERNET_VEGA_MONOBANK(
            INTERNET_COMPANY_VEGA_UA.getOriginalPhrase(),
            new NameBuilder()
                    .addItem("Інтернет_Вега_")
                    .addItem(new NameItem(PAID, NameBuilder::dateToYear))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToMonth))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToDay))
    ),
    COLD_WATER_SERVICE_FEE_MONOBANK(
            BillKeyword.COLD_WATER_SERVICE_FEE.getOriginalPhrase(),
            new NameBuilder()
                    .addItem("Київводоканал_обслуговування_")
                    .addItem(new NameItem(PAID, NameBuilder::dateToYear))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToMonth))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToDay))
    ),
    HOT_WATER_SERVICE_FEE_MONOBANK(
            BillKeyword.HOT_WATER_SERVICE_FEE.getOriginalPhrase(),
            new NameBuilder()
                    .addItem("ГВ_обслуговування_")
                    .addItem(new NameItem(PAID, NameBuilder::dateToYear))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToMonth))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToDay))
    ),
    CENTRAL_HEATING_SERVICE_FEE_MONOBANK(
            BillKeyword.CENTRAL_HEATING_SERVICE_FEE.getOriginalPhrase(),
            new NameBuilder()
                    .addItem("ЦО_обслуговування_")
                    .addItem(new NameItem(PAID, NameBuilder::dateToYear))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToMonth))
                    .addItem(".")
                    .addItem(new NameItem(PAID, NameBuilder::dateToDay))
    );

    private String keyString;
    private NameBuilder nameBuilder;

    BillType(String keyString, NameBuilder nameBuilder) {
        this.keyString = keyString;
        this.nameBuilder = nameBuilder;
    }

    public String getKeyString() {
        return keyString;
    }

    public NameBuilder getNameBuilder() {
        return nameBuilder;
    }
}
