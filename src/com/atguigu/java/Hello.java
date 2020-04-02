package com.atguigu.java;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author jinsk
 * @create 2020-03-28 23:37
 * @date 2020/3/28-23:37
 */
public class Hello {
    private static final int ISK_SIZE=10;
    public static final int NUM=1;
    public static final int NUM2=1;
    public static final String STRING="list";
    public static void main(String[] args) {
        System.out.println("hello!");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Hello.main");
        System.out.println("args = " + args);
        String[] arr = new String[]{"Tom","Jerry","Rose"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println("s = " + s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println("s = " + s);
        }
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Object o : list) {
            
            
        }
        for (int i = 0; i < list.size(); i++) {
            
            
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

    }
    public void method(){
        System.out.println("Hello.method");
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        if (list == null) {
            
        }
        if (list != null) {

        }
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
