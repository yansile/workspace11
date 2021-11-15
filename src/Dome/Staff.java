package Dome;

public class Staff extends Employee{


    public  String title;

    public Staff() {
    }

    public Staff(String name, int age, String address, int phoneNumber, String department, double salary, String office, String title) {
        super(name, age, address, phoneNumber, department, salary, office);
        this.title = title;
    }


}
