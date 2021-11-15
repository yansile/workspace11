package Dome;

import java.text.DecimalFormat;

//25、 编写一个包含学生基本资料的结构类型数据(要求包括姓名，性别，年龄，身高，体重等)。
public class Dome26 {
      private String sname;
      private String sex;
      private int age;
      private double stature;
      private double weight;

    public Dome26() {
    }

    public Dome26(String sname, String sex, int age, double stature, double weight) {
        this.sname = sname;
        this.sex = sex;
        this.age = age;
        this.stature = stature;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dome26{" +
                "sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", stature=" + stature +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Dome26  d = new Dome26("张三","男",12,1.45,44.0);
        System.out.println(d.toString());
    }
}
