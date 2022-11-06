package pro.sky.java.ds_3_0.task1;

public class Mechanic<T extends Transport> {

    private final String name;
    private final String surname;
    private final String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public boolean maintenance(T auto) {
        return auto.passDiagnostics();
    }

    public void repair(T auto) {
        auto.repair();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return name + " " + surname + " из " + company;
    }
}
