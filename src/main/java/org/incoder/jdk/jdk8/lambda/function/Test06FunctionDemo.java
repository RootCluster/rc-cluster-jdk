/*
 * Copyright (C) 2018 Jerry xu Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.incoder.jdk.jdk8.lambda.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * Function 相关的示例.
 *
 * @author : Jerry xu
 * @date : 8/5/2018 4:59 PM
 */
public class Test06FunctionDemo {

    public static void main(String[] args) {

        Person person1 = new Person("zhangsan", 10);
        Person person2 = new Person("lisi", 20);
        Person person3 = new Person("wangwu", 30);

        List<Person> personList = Arrays.asList(person1, person2, person3);

        Test06FunctionDemo test = new Test06FunctionDemo();
        // 从集合中取出username 等于 zhangsan
        String params = "zhangsan";
        List<Person> personResult = test.getPersonByUsername(params, personList);
        personResult.forEach(person -> System.out.println(person.getUserName()));
        // 从集合这种取出满足年龄条件的数据
        int constant = 15;
        List<Person> personResult1 = test.getPersonByAge(constant, personList);
        personResult1.forEach(person -> System.out.println("年龄大于" + constant + "集合:" + person.getUserName()));

        // 通过自行传入逻辑的行为
        String params1 = "wangwu";
        List<Person> personListAction = test.getPersonByUsername(params1, personList,
                (username, persons) ->
                        persons.stream()
                                .filter(person -> person.getUserName().equals(username))
                                .collect(Collectors.toList()));

        personListAction.forEach(person -> System.out.println("姓名等于" + params1 + "集合:" + person.getUserName()));

        int constant1 = 25;
        List<Person> personListAge = test.getPersonByAge(constant1, personList,
                (ageOfPerson, persons) ->
                        persons.stream().filter(person -> person.getAge() < ageOfPerson)
                                .collect(Collectors.toList()));

        personListAge.forEach(person -> System.out.println("年龄小于" + constant1 + "集合:" + person.getUserName()));
    }

    //提前定义好执行的方法函数

    private List<Person> getPersonByUsername(String username, List<Person> persons) {
        return persons.stream().filter(person -> person.getUserName().equals(username))
                .collect(Collectors.toList());
    }

    private List<Person> getPersonByAge(int age, List<Person> persons) {
        // 接收两个参数，返回一个结果
        BiFunction<Integer, List<Person>, List<Person>> biFunction =
                (ageOfPerson, personList) -> personList.stream()
                        .filter(person -> person.getAge() > ageOfPerson)
                        .collect(Collectors.toList());

        return biFunction.apply(age, persons);
    }

    // 在使用时，用户自己传入要执行的逻辑行为

    private List<Person> getPersonByUsername(String username, List<Person> persons, BiFunction<String, List<Person>, List<Person>> biFunction) {
        return biFunction.apply(username, persons);
    }

    private List<Person> getPersonByAge(int age, List<Person> persons, BiFunction<Integer, List<Person>, List<Person>> biFunction) {
        return biFunction.apply(age, persons);
    }

}
