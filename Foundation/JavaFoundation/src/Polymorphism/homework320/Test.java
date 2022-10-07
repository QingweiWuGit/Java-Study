package Polymorphism.homework320;

public class Test {
    public static void main(String[] args) {
        int n;
        //生成父类对象数组,数组长度为5
        Animal[] animal = new Animal[5];
        for(int i=0; i<animal.length; i++){
            //产生随机数，随机产生三种具体子类的实例
            n = (int)(Math.random()*3);
            switch (n){
                case 0 : animal[i]=new Cat(); break;
                case 1 : animal[i]=new Dog(); break;
                case 2 : animal[i]=new Sheep(); break;
            }
        }
        //循环输出，循环体中每个对象分别调用cry()方法。
        for(int i=0; i<animal.length; i++){
            animal[i].cry();
        }
    }
}
