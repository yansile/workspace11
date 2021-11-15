package construchor;

public class Fan {
//    3、写一个名叫Fan的类模拟风扇，属性为speed、on和radius。要求为属性提供获取器方法，并提供toString（）方法，
//    返回包含类中所有属性值的字符串。假设风扇有三种固定的转速，用常数1、2、3分别表示慢、中、快速。类的框架同第二题。

    private int speed;
    private boolean on;
    private double radius;

    public Fan(){

    }
    public Fan(int speed,boolean on, double radius){
        this.speed=speed;
        this.on=on;
        this.radius=radius;

    }

    public Fan(int speed){
        this.speed=speed;
        if (speed==1) {
            this.on = true;
            this.radius = 20.0;
        }
        if (speed==2) {
            this.on = true;
            this.radius = 30.0;
        }
        if (speed==3) {
            this.on = true;
            this.radius = 40.0;
        }
    }
    @Override
    public String toString() {
        return "Fan{" +
                "转速=" + speed +
                ", 开关状态=" + on +
                ", 风扇半径=" + radius +
                '}';
    }

    public static void main(String[] args) {
       Fan f = new Fan(2);

        System.out.println( f.toString());
    }


}
