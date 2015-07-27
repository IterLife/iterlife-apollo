package com.iterlife.designpattern.absfactory;


/**
 * @Description:com.iterlife.designpattern.absfactory.Client
 *
 * @author:Lu Jie
 * @E-Mail:lujie0403@163.com
 * @date:2015-7-19 ����7:25:44
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Client {

	public static void main(String[] args) {
		absfactory product1Factory = new Product1Factory();
		absfactory product2Factory = new Product2Factory();
		product1Factory.creatorProductA().doSomething();
		product1Factory.creatorProductB().doSomething();
		product2Factory.creatorProductA().doSomething();
		product2Factory.creatorProductB().doSomething();
	}

}