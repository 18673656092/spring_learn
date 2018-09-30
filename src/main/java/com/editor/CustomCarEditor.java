package com.editor;

import java.beans.PropertyEditorSupport;

/**
 * Created by zhuran on 2018/9/29 0029
 */
public class CustomCarEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) {
        if(text==null|| !text.contains(",")){
            throw new IllegalArgumentException();
        }
        String info[] = text.split(",");
        Car car = new Car();
        car.setBrand(info[0]);
        car.setBrand(info[1]);
        setValue(car);
    }
}
