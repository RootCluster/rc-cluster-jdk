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
import java.util.function.Predicate;

/**
 * Predicate.
 * 给定一个参数，判断这个参数是否符合某个条件
 *
 * @author : Jerry xu
 * @date : 8/5/2018 6:03 PM
 */
public class Test07PredicateFunction {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        Test07PredicateFunction test = new Test07PredicateFunction();
        System.out.println("===============全部输出=================");
        test.conditionFilter(list, item -> true);
        System.out.println("===============输出偶数=================");
        test.conditionFilter(list, item -> item % 2 == 0);
        System.out.println("===============输出奇数=================");
        test.conditionFilter(list, item -> item % 2 != 0);
        System.out.println("===============输出小于3=================");
        test.conditionFilter(list, item -> item < 3);
        System.out.println("===============输出大于5=================");
        test.conditionFilter(list, item -> item > 5);

    }

    private void conditionFilter(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer integer : list) {
            if (predicate.test(integer)) {
                System.out.println(integer);
            }
        }
    }

    private void conitionFilter1(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate1) {
        for (Integer integer : list) {
            // 与
            /*if (predicate.and(predicate1).test(integer)) {
                System.out.println(integer);
            }*/
            // 或
            /*if (predicate.or(predicate1).test(integer)) {
                System.out.println(integer);
            }*/
            // 非 negate()1
            if (predicate.and(predicate1).negate().test(integer)) {
                System.out.println(integer);
            }
        }
    }

}
