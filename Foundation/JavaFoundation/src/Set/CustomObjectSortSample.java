package Set;

import java.util.ArrayList;
import java.util.*;

public class CustomObjectSortSample {
    private static class CustomComparator implements Comparator<Goods>{

        @Override
        public int compare(Goods o1, Goods o2) {
//            return o1.getSn().compareTo(o2.getSn());
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }

    public static void main(String[] args) {
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods("18827382190", "商品A"));
        goodsList.add(new Goods("83219078978", "商品B"));
        goodsList.add(new Goods("83241781237", "商品C"));
        goodsList.add(new Goods("18579831426", "商品D"));
        System.out.println("排序前：");
        System.out.println(goodsList);
        Collections.sort(goodsList, new CustomComparator());
        System.out.println("排序后：");
        System.out.println(goodsList);
    }
}
