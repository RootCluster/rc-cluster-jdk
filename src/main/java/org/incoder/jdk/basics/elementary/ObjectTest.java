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

package org.incoder.jdk.basics.elementary;

/**
 * Description.
 *
 * @author : Jerry xu
 * @date : 8/19/2018 12:46 PM
 */
public class ObjectTest {


    public static void main(String[] args) {
        ObjectTest test = new ObjectTest();
        int a = 1, b = 2;
        int c = test.add(a, b);
        int d = test.subtract(a, b);
        int e = test.multiply(a, b);
        int f = test.divide(a, b);
        System.out.println("加法计算结果：" + c);
        System.out.println("减法计算结果：" + d);
        System.out.println("乘法计算结果：" + e);
        System.out.println("除法计算结果：" + f);
    }


    /**
     * 求和
     *
     * @param a 参数
     * @param b 参数
     * @return 两个数的和
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * 求差
     *
     * @param a 参数
     * @param b 参数
     * @return 两个数的差
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * 求积
     *
     * @param a 参数
     * @param b 参数
     * @return 两个数的积
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * 求商
     *
     * @param a 参数
     * @param b 参数
     * @return 两个数的商
     */
    public int divide(int a, int b) {
        return a / b;
    }

}
