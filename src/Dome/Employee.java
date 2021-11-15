package Dome;
//    Employee中的雇员有department、salary、office。
public class Employee extends Person {
    protected String department;
    protected  double salary;
    protected  String office;

    public Employee() {
    }

    public Employee(String name, int age, String address, int phoneNumber, String department, double salary, String office) {
        super(name, age, address, phoneNumber);
        this.department = department;
        this.salary = salary;
        this.office = office;
    }
}
