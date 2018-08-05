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

import java.util.*;

/**
 * 字符串排序.
 *
 * @author : Jerry xu
 * @date : 8/4/2018 5:52 PM
 */
public class Test02Comparator {

    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("zhang san", "li si", "wang wu", "zhao liu");

        // 经典操作
        Collections.sort(nameList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 倒叙，就地排序，不会产生一个新的集合
                return o2.compareTo(o1);
            }
        });
        // lambda操作
        Collections.sort(nameList, (String o1, String o2) -> {
            return o2.compareTo(o1);
        });
        // statement {return o2.compareTo(o1);}
        Collections.sort(nameList, (o1, o2) -> {
            return o2.compareTo(o1);
        });
        // expression(表达式风格) o2.compareTo(o1)
        Collections.sort(nameList, (o1, o2) -> o2.compareTo(o1));

        nameList.sort(Comparator.reverseOrder());

        System.out.println(nameList);
    }
}
