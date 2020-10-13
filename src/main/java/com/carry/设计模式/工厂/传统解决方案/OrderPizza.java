package com.carry.设计模式.工厂.传统解决方案;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    	public OrderPizza() {
		Pizza pizza = null;
		String orderType;
		do {
			orderType = getType();
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


	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("请输入披萨类型：cheese，pepper");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}
