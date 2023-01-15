package com.driver;

public class Main {
    public static void main(String[] args){
        RWOnly obj = new RWOnly();
//        System.out.println(obj.name);
//        C:\Users\ddong\encapsulation-DDongleGithub\src\main\java\com\driver\Main.java:6:31
//        java: name has private access in com.driver.RWOnly
        obj.setName("DD");
        obj.getName();
    }
  
}