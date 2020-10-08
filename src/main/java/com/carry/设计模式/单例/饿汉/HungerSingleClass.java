package com.carry.设计模式.单例.饿汉;

public class HungerSingleClass {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance.hashCode() == instance1.hashCode());
    }
}


class Singleton {


    private Singleton() {

    }

    private final static Singleton SINGLETON = new Singleton();


    public static Singleton getInstance() {
        return SINGLETON;
    }
}
