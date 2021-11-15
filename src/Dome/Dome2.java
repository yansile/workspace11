package Dome;

import java.util.Scanner;

//1、从键盘输入一个正整数，按数字的相反顺序输出。
public class Dome2 {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数");
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        char[] sum = new char[num.length()];
      //  System.out.println(num);
        for (int i = 0 ; i <num.length();i++){
             char a  = num.charAt(i);
            sum[i] =a;
         //   System.out.println(sum[i]);
        }
        String str = "";
         for (int i =sum.length-1;i>=0;i--){
             str+=sum[i];

         }
        System.out.println(str);
    }

}
