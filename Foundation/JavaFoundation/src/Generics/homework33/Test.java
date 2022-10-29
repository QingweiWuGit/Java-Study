package Generics.homework33;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //定义List并添加Dog类对象
        Animal badi = new Dog("巴迪");
        Animal doudou = new Dog("豆豆");
        List<Animal> animalList = new ArrayList<Animal>();
        animalList.add(badi);
        animalList.add(doudou);
        //定义List并添加Cat类对象
        Animal huahua = new Cat("花花");
        Animal fanfan = new Cat("凡凡");
        animalList.add(huahua);
        animalList.add(fanfan);
        //使用AnimalPlay类的方法，按照演示效果输出内容
        AnimalPlay animalPlay = new AnimalPlay();
        animalPlay.playGame(animalList);
    }
}