package Dome;

public class Faculty extends Employee {
    protected  int officeHours;
    protected  int rank;

    public Faculty() {
    }

    public Faculty(String name, int age, String address, int phoneNumber, String department, double salary, String office, int officeHours, int rank) {
        super(name, age, address, phoneNumber, department, salary, office);
        this.officeHours = officeHours;
        this.rank = rank;
    }

}
