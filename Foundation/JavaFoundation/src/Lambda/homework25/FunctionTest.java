package Lambda.homework25;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(13);
        list.add(14);
        list.add(18);
        list.add(101);
        Function<List<Integer>, Integer> findMax = l -> {
          Integer maxNum = l.get(0);
          for(int i=1; i<l.size(); i++){
              if (maxNum < l.get(i)){
                  maxNum = l.get(i);
              }
          }
          return maxNum;
        };
        System.out.println("集合中的数据："+list);
        System.out.println("List集合中最大值是："+findMax.apply(list));
    }
}
