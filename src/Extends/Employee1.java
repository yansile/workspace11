package Extends;

public class Employee1 {
    private String name;
    private double salary;

    public Employee1(){}

    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void show(){
        System.out.println(name+salary);
    }

}
