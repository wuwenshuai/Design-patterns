package com.carry.设计模式.工厂.简单工厂;

public class OrderGreekPizza extends Pizza {
    public OrderGreekPizza() {
        CheesePizza cheesePizza = new CheesePizza();
        cheesePizza.setName("Greek");
        System.out.println("name:" + cheesePizza.name);
    }

    @Override
    public void prepare() {
        System.out.println("OrderGreekPizza is prepare");
    }
}
