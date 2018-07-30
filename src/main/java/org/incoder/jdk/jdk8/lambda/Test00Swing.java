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

import javax.swing.*;

/**
 * Lambda 初识
 *
 * @author : Jerry xu
 * @date : 7/31/2018 12:34 AM
 */
public class Test00Swing {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("My JFrame");
        JButton jButton = new JButton("My JButton");

        // 通过添加匿名ActionListener类
        /*jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Pressed!");
            }
        });*/

        // 通过lambda表达表示（参数 -> lambda执行体[代码块]）
        /*jButton.addActionListener((ActionEvent event) -> System.out.println("Button Pressed!"));*/

        // lambda执行体有多个，则用{}包含执行体
        jButton.addActionListener(event -> {
                    // 执行命令一
                    System.out.println("Button Pressed!");
                    // 执行命令二
                    System.out.println("Hello world");
                    // 等等...
                }
        );

        // lambda表达式基本结构
        /*(param1, param2, param3) -> {
            // 执行体...

        };*/

        jFrame.add(jButton);
        // 设置自适应组件大小
        jFrame.pack();
        jFrame.setVisible(true);
        // 设置默认关闭行为
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
