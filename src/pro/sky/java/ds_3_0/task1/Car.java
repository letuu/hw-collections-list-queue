package pro.sky.java.ds_3_0.task1;

import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competing {

    private BodyType bodyType;

    public Car(String brand, String model, float engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    @Override
    public void startMoving() {
        System.out.printf("Легковая машина %s %s поехала\n",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void stopMoving() {
        System.out.printf("Легковая машина %s %s остановилась\n",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void printType() {
        if (bodyType != null) {
            System.out.println(bodyType);
        } else {
            System.out.println("Данных по авто недостаточно");
        }
    }

    @Override
    public boolean passDiagnostics() {
        return Math.random() > 0.4;
    }

    @Override
    public void repair() {
        System.out.println("Машина " + getBrand() + " " + getModel() + " отремонтирована");
    }

    @Override
    public String toString() {
        return "Car{" +
                "transport=" + super.toString() +
                ", bodyType='" + bodyType + '\'' +
                '}';
    }

    @Override
    public void pitStop() {
        System.out.printf("Легковая машина %s %s совершила Пит-стоп\n",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(900, 1000);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(300, 370);
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}
