package com.spring;

public class JavaMyArray {
    //声明一个数组
    private int[] intArray;
    //数组实际有效长度
    private int elems;
    //数组最大长度
    private int length;
    //构造方法，默认数组长度
    public JavaMyArray(){
        elems = 0;
        length = 50;
        intArray = new int[length];
    }
    //构造方法，设置数组最大长度
    public JavaMyArray(int length){
        elems = 0;
        this.length = length;
        intArray = new int[length];
    }
    //获取数组有效长度
    public int getElems() {
        return elems;
    }
    //遍历元素
    public void display(){
        for(int i=0;i<elems;i++){
            System.out.print(intArray[i] + " ");
        }
    }
    //增加元素
    public boolean add(int value){
        if(elems==length){
            return false;
        }else {
            intArray[elems] = value;
            elems++;
        }
        return true;
    }
    //通过下标查找元素
    public String get(int i){
        if(i<0||i>=elems){
            return "数组越界";
        }else {
            return String.valueOf(intArray[i]);
        }
    };
    //判断元素是否存在
    public boolean serach(int value){
        for (int i:intArray) {
            if(value == intArray[i]){
                return true;
            }
        }
        return false;
    }
    //元素存在在第几个位置
    public int find(int value){
        for (int i:intArray) {
            if(value == intArray[i]){
                return i;
            }
        }
        return -1;
    }
    //删除元素
    public boolean delete(int value){
        if(serach(value)){
            if(find(value)==elems-1){
                elems--;
            }else {
                for(int i = find(value);i<elems-1;i++){
                  intArray[i] = intArray[i+1];
                  elems--;
                }
            }
        }
        return true;
    }
    //在指定位置增加元素
    public boolean add(int value,int i){
        if(elems==length){
            return false;
        }else {
            if(i==elems){
                intArray[i] = value;
                elems++;
            }else {
                int temp = elems;
                for(int j=i;j<elems;j++){
                    intArray[temp] = intArray[temp-1];
                    temp--;
                }
                intArray[i] = value;
                elems++;
            }
        }
        return true;
    }
}