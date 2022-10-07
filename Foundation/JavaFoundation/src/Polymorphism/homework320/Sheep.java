package Polymorphism.homework320;

public class Sheep extends Animal {
    //重写父类的方法cry(),要求输出信息“小羊的叫声：咩咩咩~~~”
    @Override
    public void cry() {
        System.out.println("小羊的叫声：咩咩咩~~~");
    }
}
