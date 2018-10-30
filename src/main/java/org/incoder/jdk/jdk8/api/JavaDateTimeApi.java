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

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Set;
import java.util.TreeSet;

/**
 * Java8中日期时间的使用.
 * <ul>
 * <li>1. Java8中所有的时间日期API都是不可变类，是线程安全的</li>
 * <li>2. 现有的Date,Calendar api中SimpleDateFormat类都是可变的，非线程安全的</li>
 * </ul>
 *
 * @author : Jerry xu
 * @date : 10/30/2018 2:26 AM
 */
public class JavaDateTimeApi {

    public static void main(String[] args) {

        basicUsage();

        otherApi();

    }

    private static void otherApi() {
        Clock clock = Clock.systemDefaultZone();
        System.out.println("当前时区：" + clock);

        LocalDate localDate = LocalDate.now();
        LocalDate schedule = LocalDate.of(2018, 10, 8);
        // 指定日期与当前日期比较
        System.out.println(localDate.isAfter(schedule));
        System.out.println(localDate.isBefore(schedule));
        System.out.println(localDate.equals(schedule));

        // 时区
        Set<String> set = ZoneId.getAvailableZoneIds();
        // 使用TreeSet对时区进行排序
        Set<String> treeSet = new TreeSet<String>() {
            {
                addAll(set);
            }
        };
        // 已排序
        treeSet.forEach(System.out::println);
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("当前的日期时间：" + localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println("当前的日期时间（包含时区）：" + zonedDateTime);

        // 年月
        YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth.lengthOfYear());
        System.out.println(yearMonth.lengthOfMonth());
        // 构造指定时间的年月
        YearMonth scheduleDate = YearMonth.of(2018, 10);
        System.out.println("指定时间的年长度：" + scheduleDate.lengthOfYear());
        System.out.println("指定时间的月长度：" + scheduleDate.lengthOfMonth());
        System.out.println("指定时间是否是闰年：" + scheduleDate.isLeapYear());

        // 时间间隔
        Period period = Period.between(localDate, schedule);
        System.out.println("时间间隔年：" + period.getYears());
        System.out.println("时间间隔月：" + period.getMonths());
        System.out.println("时间间隔天：" + period.getDays());

        // 时间线上的时间点
        System.out.println("当前时刻（不带时区的UTC标准时间）：" + Instant.now());
    }

    private static void basicUsage() {
        LocalDate localDate = LocalDate.now();
        System.out.println("当前日期：" + localDate);

        System.out.println(localDate.getYear() + "," + localDate.getMonthValue() + "," + localDate.getDayOfMonth());

        LocalDate localPlus = localDate.plus(2, ChronoUnit.WEEKS);
        System.out.println("当前日期再加上2周：" + localPlus);

        LocalDate localMinus = localDate.minus(2, ChronoUnit.MONTHS);
        System.out.println("当前日期再减去2个月：" + localMinus);

        // LocalDate 处理年月日
        LocalDate local = LocalDate.of(2018, 10, 8);
        System.out.println(local);

        // MonthDay 处理月份和天，与年无关，例如：生日
        MonthDay monthDay = MonthDay.of(local.getMonth(), local.getDayOfMonth());
        MonthDay month = MonthDay.from(LocalDate.of(2017, 10, 8));
        if (monthDay.equals(month)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

        // LocalTime 处理时分秒
        LocalTime time = LocalTime.now();
        System.out.println("当前时间：" + time);

        LocalTime localTime = time.plusHours(3).plusMinutes(30);
        System.out.println("当前时间加上3小时，30分钟：" + localTime);

    }

}
