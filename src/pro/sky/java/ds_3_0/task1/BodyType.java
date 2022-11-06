package pro.sky.java.ds_3_0.task1;

public enum BodyType {

    SEDAN("Sedan"),
    HATCHBACK("Hatchback"),
    COUPE( "Coupe"),
    UNIVERSAL("Universal"),
    SUV("SUV"),
    CROSSOVER("Crossover"),
    PICKUP("Pickup"),
    VAN("Van"),
    MINIVAN("Minivan");


    private final String strBodyType;

    BodyType(String strBodyType) {
        this.strBodyType = strBodyType;
    }

    public String getStrBodyType() {
        return strBodyType;
    }


    @Override
    public String toString() {
        return "Тип кузова авто: " + strBodyType;
    }
}
