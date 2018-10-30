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
 * Java基本数据类型.
 *
 * @author : Jerry xu
 * @date : 8/13/2018 2:55 AM
 */
public class PrimitiveDataTypes {

    private static byte a;
    private static Byte A;
    private static int b;
    private static Integer B;
    private static long c;
    private static Long C;
    private static short d;
    private static Short D;
    private static float e;
    private static Float E;
    private static double f;
    private static Double F;
    private static boolean g;
    private static Boolean G;
    private static char h;
    private static Character H;

    public static void main(String[] args) {

        System.out.println("byte：默认值 = " + a);
        System.out.println("Byte：默认值 = " + A);
        System.out.println("==========================================");
        System.out.println("int：默认值 = " + b);
        System.out.println("Integer：默认值 = " + B);
        System.out.println("==========================================");
        System.out.println("long：默认值 = " + c);
        System.out.println("Long：默认值 = " + C);
        System.out.println("==========================================");
        System.out.println("short：默认值 = " + d);
        System.out.println("Short：默认值 = " + D);
        System.out.println("==========================================");
        System.out.println("float：默认值 = " + e);
        System.out.println("Float：默认值 = " + E);
        System.out.println("==========================================");
        System.out.println("double：默认值 = " + f);
        System.out.println("Double：默认值 = " + F);
        System.out.println("==========================================");
        System.out.println("boolean：默认值 = " + g);
        System.out.println("Boolean：默认值 = " + G);
        System.out.println("==========================================");
        System.out.println("char：默认值 = " + h);
        System.out.println("Character：默认值 = " + H);
    }
}
