package Polymorphism.circus;

import java.util.Scanner;

public class Circus {
    public static void main(String[] args) {
        Circus circus = new Circus();
        Scanner scanner = new Scanner(System.in);
        int action, actor;
        while(true){
            circus.menu();
            actor = scanner.nextInt();
            switch (actor){
                case 1:
                    // 原先使用这种方法
//                    circus.bearActor();
                    // 第二种方法输出信息
                    new Bear("Bill", 1).act();
                    break;
                case 2:
//                    circus.lionActor();
                    new Lion("Lain", 2, "灰色", "公狮").act();
                    break;
                case 3:
//                    circus.monkeyActor();
                    new Monkey("Tom", 1, "金丝猴").act();
                    break;
                case 4:
//                    circus.parrotActor();
                    new Parrot("Rose", 1, "牡丹鹦鹉").act();
                    break;
                case 5:
//                    circus.clownActor();
                    new Clown("Kahle", 5).act();
            }
            System.out.println("****************是否继续观看（1/0）****************");
            action = scanner.nextInt();
            if(action==0){
                System.out.println("********   欢迎下次光临   ***********");
                break;
            }
        }
    }

    void parrotActor(){
        Parrot parrot = new Parrot("Rose", 1, "牡丹鹦鹉");
        System.out.println("表演者：" + parrot.getName());
        System.out.println("年龄：" + parrot.getAge() + "岁");
        System.out.println("品种：" + parrot.getType());
        parrot.skill();
        parrot.love();
    }

    void clownActor(){
        Clown clown = new Clown("Kahle", 5);
        System.out.println("表演者：" + clown.getName());
        System.out.println("艺龄：" + clown.getYears() + "年");
        clown.dress();
        clown.skill();
    }

    void monkeyActor(){
        Monkey monkey = new Monkey("Tom", 1, "金丝猴");
        System.out.println("表演者：" + monkey.getName());
        System.out.println("年龄：" + monkey.getAge() + "岁");
        System.out.println("品种：" + monkey.getType());
        monkey.skill();
        monkey.love();
    }

    void lionActor(){
        Lion lion = new Lion("Lain", 2, "灰色", "公狮");
        System.out.println("表演者：" + lion.getName());
        System.out.println("年龄：" + lion.getAge() + "岁");
        System.out.println("性别：" + lion.getSex());
        System.out.println("毛色：" + lion.getColor());
        lion.skill();
        lion.love();
    }

    void bearActor(){
        Bear bear = new Bear("Bill", 1);
        System.out.println("表演者：" + bear.getName());
        System.out.println("年龄：" + bear.getAge() + "岁");
        bear.skill();
        bear.love();
    }

    void menu(){
        System.out.println("***********欢迎来到太阳马戏团***********");
        System.out.println("***********请选择表演者***********");
        System.out.println("***********1、棕熊***********");
        System.out.println("***********2、狮子***********");
        System.out.println("***********3、猴子***********");
        System.out.println("***********4、鹦鹉***********");
        System.out.println("***********5、小丑***********");
    }
}
