package Generics.homework33;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    //按任务要求实现该类
    @Override
    public void playGame() {
        System.out.println("小狗"+this.getName()+"在做游戏！");
    }
}