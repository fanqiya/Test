package com.qiqi.test.instance;

public class Singleton1 {
    /**
     * 饿汉式
     */
    private static Singleton1 singleton = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 instance() {
        return singleton;
    }
}
