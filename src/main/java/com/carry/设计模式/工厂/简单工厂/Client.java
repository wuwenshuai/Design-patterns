package com.carry.设计模式.工厂.简单工厂;

public class Client {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.createPizza("cheese");
        simpleFactory.createPizza("greek");
    }
}
