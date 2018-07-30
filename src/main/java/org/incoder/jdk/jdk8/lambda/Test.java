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

/**
 * 自定义函数式接口
 * <p>
 * 如果一个接口申明了一个抽象方法，这个抽象方法复写了Object中某个public方法，
 * 对于函数式接口自定义接口这并不会给这个抽象方法数+1
 *
 * @author : Jerry xu
 * @date : 7/31/2018 12:34 AM
 */
@FunctionalInterface
interface MyInterface {

    /**
     * test
     */
    void test();

    /**
     * 复写了Object中public toString()的方法
     *
     * @return String
     */
    @Override
    String toString();
}

/**
 * 匿名测试类
 *
 * @author : Jerry xu
 */
public class Test {

    private void test(MyInterface myInterface) {
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }

    public static void main(String[] args) {
        Test t = new Test();
//        t.test(new MyInterface() {
//            @Override
//            public void test() {
//                System.out.println("test");
//            }
//        });
        t.test(() -> System.out.println("test"));

        System.out.println("-------------------------------");

        MyInterface myInterface = () -> {
            System.out.println("hello");
        };

        System.out.println("MyInterface实例：" + myInterface.getClass());
        System.out.println("MyInterface实例父类：" + myInterface.getClass().getSuperclass());
        System.out.println("MyInterface实例实现方法：" + myInterface.getClass().getInterfaces()[0]);
    }

}
