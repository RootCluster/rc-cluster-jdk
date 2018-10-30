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
 * 流程控制语句.
 *
 * @author : Jerry xu
 * @date : 8/19/2018 8:41 AM
 */
public class FlowControlStatement {

    public static void main(String[] args) {
        whileTest();
        doWhileTest();
        forTest();
    }

    /**
     * for 循环语句
     * 计算1到100之间的和
     */
    private static void forTest() {
        System.out.println("========================for 循环语句========================");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1+2+3+...+98+99+100=" + sum);
    }

    /**
     * do...while 循环语句
     * 计算1到100之间的和
     */
    private static void doWhileTest() {
        System.out.println("========================do...while 循环语句========================");
        int a = 1;
        int sum = 0;
        do {
            sum += a;
            a++;
        } while (a <= 100);

        System.out.println("1+2+3+...+98+99+100=" + sum);
    }

    /**
     * while 循环语句
     * 计算1到100之间的和
     */
    private static void whileTest() {
        System.out.println("========================while 循环语句========================");
        int a = 1;
        int sum = 0;
        while (a <= 100) {
            sum += a;
            a++;
        }
        System.out.println("1+2+3+...+98+99+100=" + sum);
    }


}
