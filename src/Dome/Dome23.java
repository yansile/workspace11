package Dome;
//23、 定义一个行数和列数相等的二维数组，并执行初始化，然后计算该数组两条对角线上的元素值之和。
public class Dome23 {
    public static void main(String[] args) {
        int num[][] ={{1,2,3,4},{5,6,7,8},{8,7,6,5,},{4,3,2,1}};
        for (int i = 0; i <num.length ; i++) {
            for (int j = num.length-1; j >=0 ; j--) {
                int a =num[i][i] * num[j][j];
                System.out.println(a);
//                System.out.println(num[i][i] );
//                System.out.println(num[j][j]);
            }
        }
    }
}
