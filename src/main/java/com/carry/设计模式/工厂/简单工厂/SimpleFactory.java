package com.carry.设计模式.工厂.简单工厂;

public class SimpleFactory {
    public void createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new OrderChineesePizza();
            pizza.prepare();
        } else if (orderType.equals("greer")) {
            pizza = new OrderGreekPizza();
            pizza.prepare();
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("pepper 披萨");
        } else {

        }
    }

}
