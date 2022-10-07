package Polymorphism.homework46;

//子类圆Circle类
public class Circle extends Shape {
    //属性：圆的半径r
    private float r;
    //创建带参构造方法以及无参构造方法
    public Circle(){};

    public Circle(float r){
        this.setR(r);
    }
    //创建针对半径的赋值和取值方法
    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    //重写父类中area()方法
    @Override
    public double area() {
        return Math.PI*Math.pow(this.r,2);
    }

}
