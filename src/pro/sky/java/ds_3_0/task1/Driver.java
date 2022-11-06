package pro.sky.java.ds_3_0.task1;

public abstract class Driver<T extends Transport> {

   private static final String VALID_CATEGORY = "BCD";
    private final String fullName;
    private String category;
    private final int drivingExperience;
    private final T car;

    protected Driver(String fullName,
                     String category,
                     int drivingExperience,
                     T car) {
        this.fullName = fullName;
        setCategory(category);
        this.drivingExperience = drivingExperience;
        this.car = car;
    }

    public void startMovement() {
        System.out.printf("Driver %s started moving", this.fullName);
        this.car.startMoving();
    }

    public void stopMovement() {
        System.out.printf("Driver %s stopped moving", this.fullName);
        this.car.stopMoving();
    }

    public void refill() {
        System.out.printf("Driver %s refilling the %s %s",
                this.fullName, this.car.getBrand(), this.car.getModel());
    }

    public String getFullName() {
        return fullName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category == null || category.isEmpty() || !VALID_CATEGORY.contains(category)) {
            throw new IllegalArgumentException("Необходимо указать категорию прав");
        }
        this.category = category;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

//    @Override
//    public String toString() {
//        return String.format("Водитель %s управляет автомобилем %s %s и будет участвовать в заезде",
//                this.fullName, this.car.getBrand(), this.car.getModel());
//    }


    @Override
    public String toString() {
        return fullName + ", категория " + category + ", стаж вождения " + drivingExperience + " лет";
    }
}
