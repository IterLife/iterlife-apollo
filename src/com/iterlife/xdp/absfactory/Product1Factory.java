package com.iterlife.xdp.absfactory;

/**
 * @Description:com.iterlife.xdp.absfactory.Product1Factory
 *
 * @author:Lu Jie
 * @date:2015-7-19 下午7:23:49
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class Product1Factory extends AbstractFactory {

	public AbstractProductA creatorProductA() {
		return new ProductA1();
	}

	public AbstractProductB creatorProductB() {
		return new ProductB1();
	}

}
