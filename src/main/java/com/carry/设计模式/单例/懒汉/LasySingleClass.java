package com.carry.设计模式.单例.懒汉;

/**
 * @author carry.wu
 */
public class LasySingleClass {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }

}

class Singleton {


    private Singleton() {

    }

    private static Singleton SINGLETON = null;


    public static Singleton getInstance() {
        if (SINGLETON == null) {
            synchronized (Singleton.class) {
                SINGLETON = new Singleton();
            }
        }
        return SINGLETON;
    }
}



