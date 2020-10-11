package com.carry.设计模式.单例.枚举;

public enum Singleton {
    INSTANCE;

}


class SingletonEnum{


    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);

    }
}
