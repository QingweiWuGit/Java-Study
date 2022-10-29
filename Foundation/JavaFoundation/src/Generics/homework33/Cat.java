package Generics.homework33;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    //按任务要求实现该类
    @Override
    public void playGame() {
        System.out.println("小猫"+this.getName()+"在做游戏！");
    }
}