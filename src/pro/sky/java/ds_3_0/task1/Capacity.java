package pro.sky.java.ds_3_0.task1;

public enum Capacity {

    EXTRA_SMALL(0, 10),
    SMALL(0, 25),
    MEDIUM(40, 50),
    LARGE(60, 80),
    EXTRA_LARGE(100, 120);

    private final int capacityFrom;
    private final int capacityTo;

    Capacity(int capacityFrom, int capacityTo) {
        this.capacityFrom = capacityFrom;
        this.capacityTo = capacityTo;
    }

    public int getCapacityFrom() {
        return capacityFrom;
    }

    public int getCapacityTo() {
        return capacityTo;
    }

    @Override
    public String toString() {
        String capacity = capacityFrom > 0 ? capacityFrom + "-" + capacityTo
                : "до " + capacityTo;
        return "Вместимость автобуса: " + name() + " (" + capacity + " мест)";
    }
}
