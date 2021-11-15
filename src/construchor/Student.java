package construchor;

public class Student {
////           具有属性：姓名，性别，年龄，年级。
//             具有方法：自我介绍，负责输出该学生的所有属性。
//            （3）具有两个带参数的构造方法：第一个构造方法中，具有两个参数：姓名、年龄。性别默认为男，年级为S1，其它属性由参数给定；
//            第二个构造方法中，所有属性的值都由参数给定。
//            （4）编写测试类StudentTest进行测试，分别以两种方式完成对两个Student对象的初始化工作，
//            并分别调用它们的自我介绍方法，看看输出结果。
    private String sName;
    private String sex;
    private int age;
    private String grade;

    public Student(){

    }
    public Student(String sName,int age){
        this.sName = sName;
        this.sex = "男";
        this.age = age;
        this.grade ="s1";
    }
    public Student(String sName, String sex, int age, String grade) {
        this.sName = sName;
        this.sex = sex;
        this.age = age;
        this.grade = grade;
    }


    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student stu = new Student("ysl",20);
        System.out.println(stu.toString());
        Student stu1 = new Student("sl","女",20,"s2");
        System.out.println(stu1.toString());
    }
}
