package com.cognizant.truYum.util;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUtil {
    public static Date convertToDate(String date) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            format.setLenient(false);
            return (Date) format.parse(date);
        } catch (ParseException e) {
            System.out.println("Date format went wrong");
        }
        return null; // will not be excecuted
    }
}
