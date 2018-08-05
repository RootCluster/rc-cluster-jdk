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
 * Description.
 *
 * @author : Jerry xu
 * @date : 8/5/2018 1:48 PM
 */
public class Test03Function {

    public static void main(String[] args) {

        Test03Function test = new Test03Function();
        int constant = 1;
        // 传递方法
        // 加
        System.out.println(test.additionMethod(constant));
        // 乘
        System.out.println(test.multiplicationMethod(constant));
        // 幂
        System.out.println(test.powerMethod(constant));
        System.out.println("=================Function=================");
        // 传递行为
        // 加
        System.out.println(test.compute(constant, value -> value + 2));
        // 乘
        System.out.println(test.compute(constant, value -> value * 2));
        // 幂
        System.out.println(test.compute(constant, value -> value * value));

    }

    private int additionMethod(int a) {
        return a + 2;
    }

    private int multiplicationMethod(int a) {
        return a * 2;
    }

    private int powerMethod(int a) {
        return a * a;
    }

    private int compute(int paras, Function<Integer, Integer> function) {
        return function.apply(paras);
    }
}
