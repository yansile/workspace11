package construchor;

import java.util.Scanner;

public class Vehicle {
//    、请定义一个交通工具(Vehicle)的类，其中有:
//    属性：速度(speed)，体积(size)等等
//    方法：移动(move())，设置速度(setSpeed(int speed))，加速speedUp（），减速speedDown()等等.
//    最后在测试类Vehicle中的main()中实例化一个交通工具对象，并通过方法给它初始化speed,size的值，
//    并且通过打印出来。另外，调用加速，减速的方法对速度进行改变。

    private double speed;
    private double size;

    public Vehicle(){}
    public Vehicle(double speed,double size){
        this.size=size;
        this.speed=speed;
    }
    public void move(){
        System.out.println("体积为"+size+"的汽车正在以"+speed+"/s的速度在行驶.....");
    }



    public static void main(String[] args) {
        Vehicle v = new Vehicle(250.0,100.0);
        Scanner sc = new Scanner(System.in);
        v.move();
        for (int i =0 ; i<1000;i++){
            System.out.println("请输入你要加减速（8888退出）");
            int num=sc.nextInt();
            
        }
    }
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
