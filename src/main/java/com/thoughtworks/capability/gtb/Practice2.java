package com.thoughtworks.capability.gtb;

import java.time.DayOfWeek;
import java.time.LocalDate;

import java.time.temporal.TemporalAdjusters;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

  public static LocalDate getNextWorkDate(LocalDate date) {

    DayOfWeek dayOfWeek = date.getDayOfWeek();
    return dayOfWeek.compareTo(DayOfWeek.FRIDAY)<0? date.plusDays(1): date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));

  }




}
