package pro.sky.java.ds_3_0.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final float engineVolume;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();

    protected Transport(String brand, String model, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public void addDriver(Driver<?> driver) {
        if (drivers.size() > 0) {
            System.out.println("У автомобиля " + getBrand() + " " + getModel() +
                    " уже есть водитель, добавление водителя " + driver.getFullName() + " невозможно!\n");
        } else {
            drivers.add(driver);
        }
    }

    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void printType();

    public abstract boolean passDiagnostics();
    public abstract void repair();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
