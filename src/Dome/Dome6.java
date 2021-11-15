package Dome;

import java.util.Scanner;

public class Dome6 {
    //、从键盘上输入两个整数，由用户回答它们的和，差，积，商和取余运算结果，并统计出正确答案的个数。
    public static void main(String[] args) {
        System.out.println("请输入两个整数");
        Scanner sc  = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("回答它们的和，差，积，商和取余运算结果:");
        int h = sc.nextInt();
        int c = sc.nextInt();
        int j = sc.nextInt();
        float s = sc.nextFloat();
        float y = sc.nextFloat();
        int d = 1;
        if (num1+num2==h){
            d+=1;
        }
        if (num1-num2==c){
            d+=1;
        }
        if (num1*num2==j){
            d+=1;
        }
        if (num1/num2==s){
            d=+1;
        }
        if (num1%num2==y){
            d+=1;
        }
        System.out.println(d);
    }
}
