package Lambda.homework22;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    public void filter(List<String> list, Predicate<String> predicate){
        list.forEach(element -> {
            if(predicate.test(element)){
                System.out.println(element + " ");
            }
        });
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "python", "php", "HTML");
        System.out.println("集合中的元素有：" + list);
        PredicateTest predicateTest = new PredicateTest();
        System.out.println("集合中包含字符'a'的元素有：");
        predicateTest.filter(list,element->element.contains("a"));
    }
}
