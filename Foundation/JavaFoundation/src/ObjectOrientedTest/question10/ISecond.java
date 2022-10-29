package ObjectOrientedTest.question10;

public interface ISecond {
    default void method(){
        System.out.println("第二个接口");
    }
}
