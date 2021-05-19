package bill;

public enum BillKeyword {
    PAID("СПЛАЧЕНО"),
    INTERNET_PAY_DATE("Дата:"),
    COUNTER1("Лічильник №1"),
    COUNTER2("Лічильник №2"),
    PREV_VALUE("попередні"),
    CURRENT_VALUE("поточні"),
    //Keywords for different types of bill
    GARBAGE_COLLECTION("вивезення побутових відходів"),
    HOT_WATER_DRAINAGE("водовідведення гарячої води"),
    HOT_WATER_SUPPLY("остачання гарячої води"),
    COLD_WATER_SUPPLY("за холодну воду"),
    ELECTRICITY_SUPPLY("електропостачання"),
    CENTRAL_HEATING("за опалення"),
    CENTRAL_HEATING_CONTRIBUTIONS("внески за централізоване опалення"),
    INTERNET_COMPANY_RU("Фринет"),
    INTERNET_COMPANY_ENG("Freenet"),
    HOUSEHOLD("утримання буд");
    private String originalPhrase;

    BillKeyword(String originalPhrase) {
        this.originalPhrase = originalPhrase;
    }

    public String getOriginalPhrase() {
        return originalPhrase;
    }

    @Override
    public String toString() {
        return originalPhrase;
    }
}
