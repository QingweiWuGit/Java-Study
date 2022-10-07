package Polymorphism.homework46;

//测试类
public class Test {

    public static void main(String[] args) {
        //创建类的实例，并分别对圆的半径和矩形的长宽进行赋值
        Circle circle = new Circle(3.5f);
        Rectangle rectangle = new Rectangle(5,6);
        //调用area（）方法，输出结果
        System.out.println(circle.area());
        System.out.println(rectangle.area());
    }
}
