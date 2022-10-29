package Lambda.homework33;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Student[] studentArray = new Student[3];
        studentArray[0] = new Student("张铭", "男", "一班");
        studentArray[1] = new Student("小红", "女", "一班");
        studentArray[2] = new Student("丽丽", "女", "一班");
        Stream<Student> streamArr = Stream.of(studentArray);
        streamArr.forEach(student -> {
            System.out.println(student.toString());
        });

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("张铭", "男", "一班"));
        studentsList.add(new Student("小红", "女", "一班"));
        studentsList.add(new Student("丽丽", "女", "一班"));
        studentsList.stream().forEach(student -> {
            System.out.println(student.toString());
        });
    }
}
