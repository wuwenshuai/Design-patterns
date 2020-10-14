package com.carry.设计模式.工厂.简单工厂;

public class OrderChineesePizza extends Pizza {


    public OrderChineesePizza() {
        CheesePizza cheesePizza = new CheesePizza();
        cheesePizza.setName("cheese");
        System.out.println("name:" + cheesePizza.name);
    }

    @Override
    public void prepare() {
        System.out.println("OrderChineesePizza is prepare");
    }
}
