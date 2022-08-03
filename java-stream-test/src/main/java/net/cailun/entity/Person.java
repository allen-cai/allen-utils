package net.cailun.entity;

import lombok.Data;

/**
 * @ClassName Persion
 * @Date 2022/8/3 16:42
 * @Author allen
 * @Description TODO
 */
@Data
public class Person {

    private String name;

    private Integer salary;

    private Integer age;

    private String sex;

    private String city;

    public Person(String name, Integer salary, Integer age, String sex, String city) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.sex = sex;
        this.city = city;
    }
}
