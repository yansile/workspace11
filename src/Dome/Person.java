package Dome;

public class Person {
//    3、实现 一个名为Person的类和它的两个子类Student和Employee。
//    Employee有子类Faculty和Staff。Person中的人有name、age、address和phoneNumber
//    ，还有display()用来返回类名和人员。 Student中的学生有年纪状态（一年级、二年级、三年级和四年级），
//    将这些年纪状态分别定义为FRESHMAN、SOPHOMORE、JUNOR、SENIOR的常量。
//    Employee中的雇员有department、salary、office。Faculty中的教员有officeHours和rank。
//    Staff中的职员有title。测试每个类的对象，并调用display（）方法，显示类名和人名。
//    提示：this.getClass()可以获取类名

        public String name;
        public int age;
        public  String address;
        public  int phoneNumber;

    public Person() {
    }

    public Person(String name, int age, String address, int phoneNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String  display(){
        return this.getClass()+":"+name;
    }


}
