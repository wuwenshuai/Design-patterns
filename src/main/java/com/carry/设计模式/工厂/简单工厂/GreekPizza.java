package com.carry.设计模式.工厂.简单工厂;

public class GreekPizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("GreekPizza 准备制作ing");
	}

}
