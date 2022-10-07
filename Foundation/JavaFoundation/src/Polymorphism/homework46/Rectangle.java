package Polymorphism.homework46;

public class Rectangle extends Shape {
    //属性：矩形的长lenghth、宽wide
    private float length;
    private float wide;

    //创建带参构造方法以及无参构造方法
    public Rectangle() {
    }

    public Rectangle(float length, float wide) {
        this.setLength(length);
        this.setWide(wide);
    }

    //创建针对长、宽的赋值和取值方法
    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWide() {
        return this.wide;
    }

    public void setWide(float wide) {
        this.wide = wide;
    }

    //重写父类的area（）方法
    @Override
    public double area() {
        return this.getLength()*this.getWide();
    }
}
