package com.niuer.setdome.sta;

public class Student {
//    编写一个学生类，学生类里有标示姓名的属性和标示年龄的属性，写一个构造方法，在构造方法里为属性赋值时，
//    必须用到this关键字。写一个输出函数，输出学生的姓名和其年龄。写一个测试类，在测试类里定义一个长度为3的学生类的对象数组，
//    为数组里的每一个元素实例化一个学生对象，并调用其输出函数，程序运行结果如下：
      private String sname;
      private  int age;

      public Student(){

      }

    public Student(String sname, int age) {
        this.sname = sname;
        this.age = age;
    }

    public static void main(String[] args) {
        Student[] stu =new Student[]{new Student("张三",24),new Student("王五",23),new Student("李四",25)};
        for (Student stus: stu) {
            stus.show();
        }
     }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println("姓名："+sname+"年龄："+age);
    }

}
