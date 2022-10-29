package Lambda.homework14;

public class Test {
    public static void main(String[] args) {
        // 标准的Lambda表达式写法
        MathOperation division = (Integer a, Integer b) -> {
            System.out.println("除法运算");
            return a/b + 0f;
        };
        // 单行实现代码可以省略大括号和return
//        MathOperation division = ((a, b) -> a/b+0f);
        // Lambda允许忽略参数类型
//        MathOperation division = (a,b)->{
//            return a/b+0f;
//        };
        System.out.println("6/3的值为："+division.operate(6,3));
    }
}
