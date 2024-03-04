package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main (String[]args){
        Date date = new Date();
        System.out.println(date.toString());
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(sdf.format(date));
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        System.out.println(sdf2.format(date));
    }
}
