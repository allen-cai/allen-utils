package net.cailun;

import net.cailun.entity.Person;

import java.util.*;

/**
 * @ClassName AgreegationTest
 * @Date 2022/8/3 16:47
 * @Author allen
 * @Description TODO
 */
public class AggregationTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("adnm", "admmt", "pot", "xbangd", "weoujgsd");

        Optional<String> max = list.stream().max(Comparator.comparing(String::length));

        System.out.println("最长的字符串：" + max.get());

        List<Integer> list1 = Arrays.asList(7, 6, 9, 4, 11, 6);

        // 自然排序
        Optional<Integer> max1 = list1.stream().max(Integer::compareTo);
        // 自定义排序
        Optional<Integer> max2 = list1.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("自然排序的最大值：" + max1.get());
        System.out.println("自定义排序的最大值：" + max2.get());

        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));
        Optional<Person> max3 = personList.stream().max(Comparator.comparingInt(Person::getSalary));
        System.out.println("员工工资最大值：" + max3.get().getSalary());


        List<Integer> list3 = Arrays.asList(7, 6, 4, 8, 2, 11, 9);

        long count = list3.stream().filter(x -> x > 6).count();
        System.out.println("list中大于6的元素个数：" + count);
    }
}
