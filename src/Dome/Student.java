package Dome;

public class Student extends Person {
    protected  static final int FRESHMAN=1;
    protected  static final int SOPHOMORE=1;
    protected  static final int JUNOR=1;
    protected  static final int SENIOR=1;

    public Student() {
    }
    public Student(String name, int age, String address, int phoneNumber) {
       super(name,age,address,phoneNumber);
    }

}
