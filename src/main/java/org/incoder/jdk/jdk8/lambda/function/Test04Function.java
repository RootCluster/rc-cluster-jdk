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

import java.util.function.Function;

/**
 * Function default compose,andThen.
 * 可实现多个function之间的串联
 *
 * @author : Jerry xu
 * @date : 8/5/2018 3:26 PM
 */
public class Test04Function {

    public static void main(String[] args) {
        Test04Function test = new Test04Function();
        int constant = 3;
        System.out.println(test.compute(constant, value -> value * 2, value -> value * value));
        System.out.println(test.compute1(constant, value -> value * 2, value -> value * value));
    }


    private int compute(int a, Function<Integer, Integer> function, Function<Integer, Integer> function1) {
        // 先执行function1.apply,然后再用执行的结果用function.apply
        // 3 * 3 => 9 * 2
        return function.compose(function1).apply(a);
    }

    private int compute1(int a, Function<Integer, Integer> function, Function<Integer, Integer> function1) {
        // 先执行function.apply,然后再用执行的结果用function1.apply
        // 3 * 2 => 6 * 6
        return function.andThen(function1).apply(a);
    }

}
