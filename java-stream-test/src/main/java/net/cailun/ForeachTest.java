package net.cailun;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName ForeachTest
 * @Date 2022/8/3 16:37
 * @Author allen
 * @Description TODO
 */
public class ForeachTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 3, 2, 1);

        //遍历出所有元素
        list.stream().forEach(System.out::println);

        //匹配第一个元素
        Optional<Integer> first = list.stream().findFirst();

        boolean anyMatch = list.stream().anyMatch(x -> x < 6);

        System.out.println("匹配第一个值：" + first.get());

        System.out.println("是否存在大于6的值： " + anyMatch);


    }
}
