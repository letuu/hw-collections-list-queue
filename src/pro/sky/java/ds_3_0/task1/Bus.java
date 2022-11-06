package pro.sky.java.ds_3_0.task1;

import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing {

    private Capacity capacity;

    public Bus(String brand, String model, float engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    @Override
    public void startMoving() {
        System.out.printf("Автобус %s %s поехал\n",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void stopMoving() {
        System.out.printf("Автобус %s %s остановился\n",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void printType() {
        if (capacity != null) {
            System.out.println(capacity);
        } else {
            System.out.println("Данных по автобусу недостаточно");
        }
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не нуждается");
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + "отремонтирован");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "transport=" + super.toString() +
                ", capacity='" + capacity + '\'' +
                '}';
    }

    @Override
    public void pitStop() {
        System.out.printf("Автобус %s %s совершил Пит-стоп\n",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(500, 600);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(180, 200);
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }
}
