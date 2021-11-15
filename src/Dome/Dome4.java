package Dome;

import java.util.Scanner;

public class Dome4 {
//    编写一段程序，运行时向用户提问“你考了多少分？（0~100）”，接受输入后判断其等级并显示出来。
//    判断依据如下：
//    等级={优 （90~100 分）；良 （80~89 分）；中 （60~69 分）；差 （0~59 分）；}
    public static void main(String[] args) {
        System.out.println("你考了多少分");
        Scanner sc =  new Scanner(System.in);
        int score = sc.nextInt();
        if (score <=100 && score>=90) {
            System.out.println("优秀");
        }else if (score<90 && score >=80){
            System.out.println("良好");
        }else if (score <80 && score>=60){
            System.out.println("及格");
        }else{
            System.out.println("差");
        }
    }
}
