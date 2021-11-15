package Dome;
//为教师编写一个程序，该程序使用一个数组存储 30 个学生的考试成绩，并给各个数组元素指定一个
//1-100 的随机值，然后计算平均成绩。
public class Dome28 {
    public static void main(String[] args) {

        int[] num = new int[30];
        int score =0;
        for (int i = 0; i <30 ; i++) {
            int a =(int)(Math.random()*(100-1)+1);
            System.out.println(a);
            num[i]=a;
            score+=a;


        }
        for (int i = 0; i <30 ; i++) {
           // System.out.println(num[i]);
        }
        System.out.println("平均成绩"+score/30);
    }
}
