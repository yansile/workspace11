package Dome;

import java.util.Scanner;

//从键盘输入三角形的三边长，
//        （1）判断这三边是否能够构成三角形；
//        （2）如果是等腰三角形，请说明是等腰三角形；
////        （3）如果是等边三角形，请说明是等边三角形；
public class Dome9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入三角形的三边长");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1+num2>num3&&num1+num3>num2&&num2+num3>num1){
            if (num1==num2&&num1==num3){
                System.out.println("是等边三角形");
            }else if (num1==num2||num1==num3||num2==num3){
                System.out.println("是等腰三角形");
            }else {
                System.out.println("是普通三角形");
            }
        }else {
            System.out.println("不能构成三角形");
        }
    }
}
