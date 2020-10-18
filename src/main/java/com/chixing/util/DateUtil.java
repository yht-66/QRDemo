package com.chixing.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类
 * 提供了日期与字符串相互转换，获得年月日等
 */
public class DateUtil {
    public static final String PATTERN_YMD = "yyyy-MM-dd";
    public static final String PATTERN_YMDHMS = "yyyy-MM-dd HH:mm:ss";
    public static final String PATTERN_HMS = "HH:mm:ss";

    /**
     * 日期转换成字符串
     * @param date 日期对象
     * @return 返回该日期的字符串的表示
     */
    public static  String date2String(Date date,String pattern){
        DateFormat dateFormat =   new SimpleDateFormat(pattern);
        return dateFormat.format(date);

    }

    /**
     * 字符串转换成日期
     * @param srcDate 字符串表示的日期
     * @return 返回日期对象
     */
    public static Date string2Date(String srcDate,String pattern){
       DateFormat dateFormat =  new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = dateFormat.parse(srcDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 获得日期的年份
     * @param date 指定日期对象
     * @return  返回对应的年份
     */
    public static int getYear(Date date){
      Calendar calendar  =  Calendar.getInstance();
      calendar.setTime(date);
      return  calendar.get(Calendar.YEAR);
    }




}
