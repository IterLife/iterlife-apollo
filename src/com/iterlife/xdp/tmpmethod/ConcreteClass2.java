package com.iterlife.xdp.tmpmethod;


/**
 * @Description:com.iterlife.xdp.tmpmethod.ConcreteClass2
 *
 * @author:Lu Jie
 * @date:2015-7-25 上午10:14:30
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class ConcreteClass2 extends AbstractClass {

	protected void doSomething1() {
		System.out.println("ConcreteClass2.doSomething1()");

	}

	@Override
	protected void doSomething2() {
		System.out.println("ConcreteClass2.doSomething2()");
	}

	@Override
	protected void doSomething3() {
		System.out.println("ConcreteClass2.doSomething3()");
	}

}
