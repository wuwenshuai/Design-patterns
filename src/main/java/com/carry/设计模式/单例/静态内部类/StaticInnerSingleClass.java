package com.carry.设计模式.单例.静态内部类;

public class StaticInnerSingleClass {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }

}

class Singleton{


    private Singleton() {

    }

    private static class SingletonInstance{
        private static final  Singleton SINGLETON = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.SINGLETON;
    }
}
