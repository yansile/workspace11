package Extends;

public class SalesPerson extends Employee1 {
    private String territory;

    public SalesPerson(){}

    public SalesPerson(String name, double salary, String territory) {
        super(name, salary);
        this.territory = territory;
    }

    public void Show1(){
        System.out.println(getName()+getSalary()+territory);
    }

}
