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
 * 进制转换（二、八、十、十六）.
 *
 * @author : Jerry xu
 * @date : 8/14/2018 2:52 PM
 */
public class BinaryConversion {

    public static void main(String[] args) {
        otherToDecimal();
        binaryToOctalAndHexadecimal();
        octalToHexadecimal();
    }

    /**
     * 【二、八、十六进制】 ↔ 【十进制】
     */
    private static void otherToDecimal() {
        // 二进制(101011) → 十进制(1*2⁵ + 0*2⁴ + 1*2³ + 0*2² + 1*2¹ + 1*2⁰ = 43)

        // 八进制(53) → 十进制(5*8¹ + 3*8⁰ = 43)

        // 十六进制(2B) → 十进制(2*16¹ + B*16⁰ = 43)

        // 十进制 → 二进制
        // 十进制 → 八进制
        // 十进制 → 十六进制
    }

    /**
     * 【二进制】 ↔ 【八、十六进制】
     */
    private static void binaryToOctalAndHexadecimal() {
        // 二进制 → 八进制
        // 八进制 → 二进制
        // 二进制 → 十六进制
        // 十六进制 → 二进制
    }

    /**
     * 【二进制】 ↔ 【八、十六进制】
     */
    private static void octalToHexadecimal() {
        // 八进制 → 十六进制
        // 十六进制 → 八进制
    }

}
