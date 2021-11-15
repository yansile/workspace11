package Dome;

import java.util.Scanner;

//编写一个应用程序用来输入的字符串进行加密，对于字母字符串加密规则如下：
//‘a’→’d’ ‘b’→’e’ ‘w’→’z’ ‘x’→’a’ ‘y’→’b’ ‘z’→’c’ ‘A’→’D’ ‘B’→’E’ ‘W’→’Z’
//        ‘X’→’A’ ‘Y’→’B’ ‘Z’→’C’ 对于其他字符，不进行加密。
public class Dome11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串（英文）：");
        String str = sc.next();
        String[] c = new String[str.length()];
        for (int i = 0 ;i<str.length();i++){
            c[i] =Character.toString(str.charAt(i));
        }
        str="";
        for (int j = 0;j<c.length;j++){

            if (c[j].equals("a")){
                c[j]="d";
            }else if (c[j].equals("b")){
                c[j]="e";
            }else if (c[j].equals("w")){
                c[j]="z";
            }else if (c[j].equals("x")){
                c[j]="a";
            }else if (c[j].equals("y")){
                c[j]="b";
            }else if (c[j].equals("z")){
                c[j]="c";
            }else if (c[j].equals("A")){
                c[j]="D";
            }else if (c[j].equals("B")){
                c[j]="E";
            }else if (c[j].equals("W")){
                c[j]="Z";
            }else if (c[j].equals("X")){
                c[j]="A";
            }else if (c[j].equals("Y")){
                c[j]="B";
            }else if (c[j].equals("Z")){
                c[j]="C";
            }

            str+=c[j];

        }
        System.out.println(str);
    }
}
