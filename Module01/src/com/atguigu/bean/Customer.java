package com.atguigu.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

//这是单行注释
public class Customer extends Person{

    private static final int initialsize = 10;
    public static void main(String[] args) {
        System.out.println("HelloWorld");
    }

    ArrayList list = new ArrayList();
    String str = new String();

    public void method(){
        int i = 1;
        list.add(1);
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void eat(){
        System.out.println("客户吃饭");
    }


}
