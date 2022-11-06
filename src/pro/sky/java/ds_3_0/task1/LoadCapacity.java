package pro.sky.java.ds_3_0.task1;

public enum LoadCapacity {

    N1(null, 3.5f),
    N2(3.5f, 12f),
    N3(12f, null);

    private  final Float weightFrom;
    private final Float weightTo;

    LoadCapacity(Float weightFrom, Float weightTo) {
        this.weightFrom = weightFrom;
        this.weightTo = weightTo;
    }

    public float getWeightFrom() {
        return weightFrom;
    }


    public float getWeightTo() {
        return weightTo;
    }


    @Override
    public String toString() {
        String strWeightFrom = weightFrom != null ? " от " + weightFrom : "";
        String strWeightTo = weightTo != null ? " до " + weightTo : "";
        return name() + " (с полной массой" + strWeightFrom + strWeightTo + " тонн)";
    }
}
