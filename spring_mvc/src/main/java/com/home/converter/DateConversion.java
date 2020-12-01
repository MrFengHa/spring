package com.home.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 文件描述
 *
 * @Author 冯根源
 * @create 2020/12/1 9:41
 */
public class DateConversion implements Converter<String, Date> {
    /**
     * Convert the source object of type {@code S} to target type {@code T}.
     *
     * @param dateStr the source object to convert, which must be an instance of {@code S} (never {@code null})
     * @return the converted object, which must be an instance of {@code T} (potentially {@code null})
     * @throws IllegalArgumentException if the source cannot be converted to the desired target type
     */
    @Override
    public Date convert(String dateStr) {
        //将日期字符串转换成真正的日期对象
        SimpleDateFormat format = new SimpleDateFormat("yyy-MM-dd");
        Date date = null;
        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
