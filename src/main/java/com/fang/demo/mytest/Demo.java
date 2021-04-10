package com.fang.demo.mytest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.List;

/**
 * @ClassName Demo
 * @Author fang
 * @Date 2021/4/9
 * @Description TODO
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {


        System.out.println(LocalDateTime.now());

        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        System.out.println(year + ".." + month + ".." + day);

        System.out.println(localDate.plusMonths(3L));

    }

}
