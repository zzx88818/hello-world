package com.factorypattern;
/**
 * 创建实现接口的实体类
 * @author XFZJ
 *
 */
public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
