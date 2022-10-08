package Polymorphism.homework18;

//测试类
public class Test {
    public static void main(String[] args) {
        //对象实例化
        Balloon balloon = new Balloon();
        Bird bird = new Bird();
        Plane plane = new Plane();
        //分别调用fly()方法
        balloon.fly();
        bird.fly();
        plane.fly();
    }
}
