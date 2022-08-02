package tree;

import circle.Point;
import randompoint.RandomPoint;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 * @Description
 * @Author allen
 * @Date 2020/8/17 17:55
 * @ClassName Main
 **/
public class Main {

    void test(String s) {
        String intern = s.intern();
        s = "allen";
    }

    void test(Integer s) {
        System.out.println(s);
        s = 666;
    }


    public static void main(String[] args) {

        final String[] i = new String[2];
        final String s = "123456";

        i[0] = "123";
        i[1] = "123";

        System.out.println(i[0] + i[1]);

        i[0] = "456";
        i[1] = "456";
        System.out.println(i[0] + i[1]);






//        String s = new String("1");
//
//        Main ai  = new Main();
//        ai.test(s);
//        System.out.println(s);
//
//        Integer s1 = 300;
//
//        ai.test(s1);
//
//        System.out.println(s1);
//
//        Integer a = 300;
//        Integer b = 300;
//
//        System.out.println(a == b);
//
//        Long a1 = 127L;
//        Long b1 = 127L;
//
//        System.out.println(a1 == b1);
//
//        String s = null;
//
//        switch (s) {
//            case "1":
//                System.out.println("1");
//            case "2":
//                System.out.println("1");
//            case "3":
//                System.out.println("1");
//            default:
//                System.out.println("null 可以正常执行");
//        }


        try {
//            Integer a = 0;
//            Point point = new Point();
//            point.setRow(1);
//            point.setR(2);
//            point.setCol(3);
//
//            List<Object> list = new ArrayList<>();
//            list.add(point);

//            String s = "sfssfdf{{123456}}sdfsdfs";
//            Pattern compile = Pattern.compile("\\{\\{.*?}}");
//            Matcher matcher = compile.matcher(s);
//
//            System.out.println(matcher.groupCount());
//            matcher.
//            String[] split = s.split("\\.", 3);
//            if (split[0].isEmpty()) {
//                System.out.println("0 is empty");
//            }
//            System.out.println(split[0]);
//            String[] split = s.split("<");
//            String[] split1 = split[1].split(">");
//
//            System.out.println(split1[0]);

//            System.out.println(list.getClass().getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
