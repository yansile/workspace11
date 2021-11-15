package com.niuer.setdome.sta;

public class Student2 {
//    编写一个学生类，类里有一个标示姓名的属性和一个静态的标示总学生个数的属性，
//    写一个构造方法，使每创建一个学生对象时学生个数自加，写一个输入结果的方法，程序运行的结果如下：

    private String sname;
    private static  int number;
    public  Student2 (){}
    public  Student2(String sname){
        this.sname=sname;
        number++;
    }
    public void show(){
        System.out.println(sname+"是第"+number+"学生。。。");
    }

    public static void main(String[] args) {
        Student2 sc = new Student2("张三");
        sc.show();
        Student2 sc1 = new Student2("小三");

        sc1.show();
    }

}
