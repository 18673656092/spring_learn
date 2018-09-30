package com.i18n;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by zhuran on 2018/9/29 0029
 */
public class Base {
    public void CN(){
        Locale locale = new Locale("zh","CN");
        NumberFormat currFmt = NumberFormat.getCurrencyInstance(locale);
        double amt = 12345.78;
        System.out.println(currFmt.format(amt));
    }
    public void US(){
        Locale locale = new Locale("en","US");
        Date date = new Date();
        DateFormat dFmt = DateFormat.getDateInstance(DateFormat.MEDIUM,locale);
        System.out.println(dFmt.format(date));
    }
    public static void main(String[] args) {
        Base base = new Base();
        base.CN();
        base.US();
    }
}
