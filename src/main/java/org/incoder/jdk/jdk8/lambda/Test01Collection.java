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

package org.incoder.jdk.jdk8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Lambda中集合循环操作
 *
 * @author : Jerry xu
 * @date : 7/31/2018 12:34 AM
 */
public class Test01Collection {

    public static void main(String[] args) {
        // 定义一个list
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        // 遍历list
        System.out.println("---------------JDK1.4---------------");
        // JDK1.4
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---------------JDK1.5---------------");
        // JDK(1.5)增强for循环
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println("---------------JDK1.8---------------");
        // JDK(1.8)新增加forEach方法
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        // JDK(1.8)forEach + lambda表达式
        list.forEach(integer -> System.out.println(integer));
        // 方法引用输出遍历结果
        list.forEach(System.out::println);
    }

}
