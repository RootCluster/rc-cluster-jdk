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
 * 运算符.
 *
 * @author : Jerry xu
 * @date : 8/18/2018 1:36 PM
 */
public class Operator {

    private static int a = 10;
    private static int b = 20;
    private static boolean c = false;
    private static boolean d = true;

    public static void main(String[] args) {
        arithmetic();
        comparison();
        logical();
        conditional();
    }

    /**
     * 条件运算
     */
    private static void conditional() {
        System.out.println("========================条件运算========================");
        // 三目运算
        System.out.println("三目运算示例：" + (a > b ? "a > b" : "a <= b"));
        // if条件判断
        if (a > b) {
            System.out.println("if条件判断结果：" + "a > b");
        } else {
            System.out.println("if条件判断结果：" + "a <= b");
        }
        // switch写法
        switch (a) {
            case 1:
                System.out.println("a的值是1");
                break;
            case 2:
                System.out.println("a的值是2");
                break;
            default:
                System.out.println("a的值未知");
        }

    }

    /**
     * 逻辑运算
     */
    private static void logical() {
        System.out.println("========================逻辑运算========================");
        System.out.println("与运算：c && d = " + (c && d));
        // 短路特性(由于c的值为false，整个表达式的结果是false，因此给d赋值“d=false”不会执行)
        System.out.println("与运算：c && d = " + (c && (d = false)));
        System.out.println("此时d的值" + d);
        System.out.println("或运算：c || d = " + (c || d));
        System.out.println("非运算：!c = " + (!c));
    }

    /**
     * 关系运算
     */
    private static void comparison() {
        System.out.println("========================关系运算========================");
        System.out.println("相等：a = b = " + (a == b));
        System.out.println("不等：a != b = " + (a != b));
        System.out.println("大于：a > b = " + (a > b));
        System.out.println("大于等于：a >= b = " + (a >= b));
        System.out.println("小于：a < b = " + (a < b));
        System.out.println("小于等于：a <= b = " + (a <= b));
    }

    /**
     * 算术运算
     */
    private static void arithmetic() {
        System.out.println("========================算术运算========================");
        System.out.println("加法：a + b = " + (a + b));
        System.out.println("减法：a - b = " + (a - b));
        System.out.println("乘法：a * b = " + (a * b));
        System.out.println("除法：a / b = " + (a / b));
        // 取模（求余数）运算的结果的正负永远与被除数即（a）的符号相同
        System.out.println("取模：a % b = " + (a % b));
    }


}
