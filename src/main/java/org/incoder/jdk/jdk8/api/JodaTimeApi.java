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

package org.incoder.jdk.jdk8.api;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;

import java.util.Date;

/**
 * Description.
 * JDK8之前JDK主要使用以下类进行时间，日期的处理,SimpleDateFormat（非线程安全）进行日期的格式化
 * 第三方时间，日期处理{@link org.joda.time}
 * <ul>
 * <li>{@link java.util.Calendar}</li>
 * <li>{@link java.util.Date}</li>
 * <li>{@link java.text.SimpleDateFormat}</li>
 * </ul>
 *
 * @author : Jerry xu
 * @date : 10/8/2018 11:43 PM
 */
public class JodaTimeApi {

    public static void main(String[] args) {
        apiInvoke();
        practicalOperation();

    }

    /**
     * 实战操作
     * 客户端与服务端时间的传递最好是传递UTC标准时间（不带时区）
     */
    private static void practicalOperation() {
        // 标准UTC时间：2018-10-08T11:43:43.765z
        System.out.println(convertUTC2Date("2018-10-08T11:43:43.765z"));

        System.out.println(convertDate2UTC(new Date()));

        System.out.println(convertDate2LocalByDateFormat(new Date(), "yyyy-MM-dd HH:mm:ss"));
    }

    /**
     * 用于客户端传递时间给服务端，服务端进行时间的处理，转换成日期
     *
     * @param utcDate utcDate
     * @return Date
     */
    private static Date convertUTC2Date(String utcDate) {
        try {
            DateTime dateTime = DateTime.parse(utcDate, DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
            return dateTime.toDate();
        } catch (Exception e) {
            return null;
        }
    }


    /**
     * 服务端的日期转换成客户端的UTC标准时间，由客户端决定去怎么呈现
     *
     * @param javaDate javaDate
     * @return String
     */
    private static String convertDate2UTC(Date javaDate) {
        DateTime dateTime = new DateTime(javaDate, DateTimeZone.UTC);
        return dateTime.toString();
    }

    /**
     * 日期时间进行字符串格式化
     *
     * @param javaDate   javaDate
     * @param dateFormat dateFormat
     * @return String
     */
    private static String convertDate2LocalByDateFormat(Date javaDate, String dateFormat) {
        DateTime dateTime = new DateTime(javaDate);
        return dateTime.toString(dateFormat);
    }

    /**
     * 简单API调用
     */
    private static void apiInvoke() {
        DateTime today = new DateTime();
        DateTime tomorrow = today.plusDays(1);

        // 输出当前日期
        System.out.println("当前日期：" + today.toString("yyyy-MM-dd"));
        // 输出当前日期+1天
        System.out.println("明天日期：" + tomorrow.toString("yyyy-MM-dd"));

        System.out.println("=====================================");

        // 输出当前月的第一天
        DateTime dateTime = today.withDayOfMonth(1);
        System.out.println(dateTime.toString("yyyy-MM-dd"));

        System.out.println("=====================================");

        // 输出当前时区日期
        LocalDate localDate = new LocalDate();
        System.out.println("当前时区日期：" + localDate);

        System.out.println("=====================================");

        // 计算当前时间后3个月的第一天日期
        localDate = localDate.plusMonths(3).dayOfMonth().withMinimumValue();
        System.out.println("当前时间后3个月的第一天日期：" + localDate);

        System.out.println("=====================================");

        // 计算2年前第3个月的最后一天的日期
        DateTime date = new DateTime();
        DateTime time = date.minusYears(2).monthOfYear().setCopy(3).dayOfMonth().withMaximumValue();
        System.out.println("2年前第3个月的最后一天的日期：" + time);
    }
}
