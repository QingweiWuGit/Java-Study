package Polymorphism.homework29;

//测试类
public class Test {

    public static void main(String[] args) {
        //完成成员内部类内部测试
        BallTest.Inner_m balltest_inner_m = new BallTest().new Inner_m();
        balltest_inner_m.play();
        //完成方法内部类测试
        BallTest ballTest = new BallTest();
        ballTest.info();
        //完成匿名内部类测试
        ballTest.playBall(new Ball() {
            @Override
            public void play() {
                System.out.println("************");
                System.out.println("匿名内部类：");
                System.out.println("打排球");
            }
        });
    }
}