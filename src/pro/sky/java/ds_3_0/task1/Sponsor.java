package pro.sky.java.ds_3_0.task1;

public class Sponsor {

    private final String name;
    private final int amount;

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void sponsorRace() {
        System.out.printf("Спонсор %s проспонсировал заезд на сумму: %d%n рублей", name, amount);
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return name + " - сумма поддержки " + amount;
    }
}
