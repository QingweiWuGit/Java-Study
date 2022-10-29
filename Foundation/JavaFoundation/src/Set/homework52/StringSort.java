package Set.homework52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSort {
    static class SampleComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2){
            return s1.compareTo(s2);
        }
    }

    public static void main(String[] args) {
        //给list添加元素
        List<String> list = new ArrayList<String>();
        list.add("orange");
        list.add("tomato");
        list.add("apple");
        list.add("litchi");
        list.add("banana");
        //输出排序前list中的内容
        System.out.println("排序前：");
        list.forEach(fruit -> {
            System.out.print(fruit + "     ");
        });
        System.out.println("");
        //对list中的元素进行排序
        Collections.sort(list, new SampleComparator());
        //输出排序后list中的内容
        System.out.println("排序后：");
        list.forEach(fruit -> {
            System.out.print(fruit + "     ");
        });
        System.out.println("");
    }
}
