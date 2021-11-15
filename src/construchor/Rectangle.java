package construchor;

public class Rectangle {
//    、写一个名为Rectangle的类表示长方形。数据域为length、width和color。Length和width是double类型的，color是String类型的。
//    假定所有矩形颜色相同，用一个静态变量表示颜色。要求提供获取器方法和计算矩形周长的computePerimeter（）
//    方法和计算矩形面积的computeArea（）方法。类的框架如下给出：
//    Public class Rectangle

        private double length = 1;
        private double weidth=1;
        private static String color= "white";
        public Rectangle(){
        }

    public Rectangle(double length, double weidth,String color) {
        this.length = length;
        this.weidth = weidth;
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeidth() {
        return weidth;
    }

    public void setWeidth(double weidth) {
        this.weidth = weidth;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Rectangle.color = color;
    }


    public void computePerimeter(double length, double weidth){
        System.out.println("周长为："+(length+weidth)*2);

    }

    public void computeArea(double length, double weidth){
        System.out.println("周长为："+(length*weidth));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(11.3,13.4,"e");
        r.computeArea(11.3,13.4);
    }
}
