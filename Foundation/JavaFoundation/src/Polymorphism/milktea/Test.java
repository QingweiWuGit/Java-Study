package Polymorphism.milktea;

public class Test {
    public static void main(String[] args) {
        int point;
        User[] users = new User[10];
        for(int i = 0; i<users.length; i++) {
            point = (int) (Math.random() * 120);
            users[i] = new User(point);
        }
        for(int i = 0; i<users.length; i++) {
            if(users[i].getPoint()<60){
                System.out.println("用户"+(i+1)+"无法领取奶茶");
            } else if (users[i].getPoint()<80) {
                System.out.println("用户"+(i+1)+"获得一杯珍珠奶茶");
            } else if (users[i].getPoint()<80) {
                System.out.println("用户"+(i+1)+"获得一杯波霸奶茶加冰淇淋加奶霜");
            } else {
                System.out.println("用户"+(i+1)+"获得一杯乌龙玛奇朵加波霸加仙草加冰淇淋");
            }
        }
    }
}
