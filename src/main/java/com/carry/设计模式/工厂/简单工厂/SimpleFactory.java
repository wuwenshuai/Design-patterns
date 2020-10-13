package com.carry.设计模式.工厂.简单工厂;

import com.carry.设计模式.工厂.传统解决方案.CheesePizza;
import com.carry.设计模式.工厂.传统解决方案.GreekPizza;
import com.carry.设计模式.工厂.传统解决方案.PepperPizza;
import com.carry.设计模式.工厂.传统解决方案.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleFactory {


    public void createPizza(String orderType) {
        Pizza pizza = null;
        do {
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("greek披萨");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("cheese披萨");
            } else if (orderType.equals("pepper")) {
                pizza = new PepperPizza();
                pizza.setName("pepper 披萨");
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

}
