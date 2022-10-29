package ObjectOrientedTest;

public class Child extends Base {
    static void test(){
        System.out.println("Child");
    }

    static public void main(String[] a){
        Child anObj = new Child();
        Base baseObj = (Base) anObj;
        baseObj.test();
    }
}