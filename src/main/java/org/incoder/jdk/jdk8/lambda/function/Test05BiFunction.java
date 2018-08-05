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

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * accepts two arguments and produces a result.
 *
 * @author : Jerry xu
 * @date : 8/5/2018 3:43 PM
 */
public class Test05BiFunction {

    public static void main(String[] args) {

        Test05BiFunction test = new Test05BiFunction();
        int constant1 = 1;
        int constant2 = 2;
        // 加
        System.out.println(test.compute(constant1, constant2, (value1, value2) -> value1 + value2));
        // 减
        System.out.println(test.compute(constant1, constant2, (value1, value2) -> value1 - value2));
        // 乘
        System.out.println(test.compute(constant1, constant2, (value1, value2) -> value1 * value2));
        // 除
        System.out.println(test.compute(constant1, constant2, (value1, value2) -> value1 / value2));
        // BiFunction andThen
        System.out.println(test.compute1(constant1, constant2, (value1, value2) -> value1 * value2, value -> value * value));
    }

    private int compute(int a, int b, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a, b);
    }

    private int compute1(int a, int b, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer> function) {
        // 1 * 2 => 2 * 2
        return biFunction.andThen(function).apply(a, b);
    }
}
