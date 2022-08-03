package net.cailun;

import net.cailun.entity.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName FilterTest
 * @Date 2022/8/3 16:41
 * @Author allen
 * @Description TODO
 */
public class FilterTest {

//    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(6, 7, 3, 8, 1, 2, 9);
//
//        Stream<Integer> stream = list.stream();
//
//        stream.filter(x -> x > 7).forEach(System.out::println);
//    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));

        List<Person> filterCollect = personList.stream().filter(x -> x.getSalary() > 8000).collect(Collectors.toList());
        System.out.println("该与8000的员工姓名： ");

        filterCollect.stream().forEach(x -> {
            System.out.println(x.getName());
        });
    }
}
