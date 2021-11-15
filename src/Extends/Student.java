package Extends;

public class Student extends Person {
//    Student中的学生有年纪状态（一年级、二年级、三年级和四年级），
//        将这些年纪状态分别定义为FRESHMAN、SOPHOMORE、JUNOR、SENIOR的常量。
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
