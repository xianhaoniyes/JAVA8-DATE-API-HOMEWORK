package com.thoughtworks.capability.gtb;

import java.security.Principal;
import java.time.LocalDate;


import static java.time.temporal.ChronoUnit.DAYS;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {

    LocalDate thisYearLabor = LocalDate.of(date.getYear(),5,1);
    long days = DAYS.between(date,thisYearLabor);
    return days>=0? days : 365 + days;
  }

}
