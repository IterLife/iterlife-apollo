package com.iterlife.xdp.command;


/**
 * @Description:com.iterlife.xdp.command.ConcreteACommand
 *
 * @author:Lu Jie
 * @date:2015-8-2 下午3:48:12
 * @version:1.0.0
 * @copyright:https://github.com/LuJie0403
 */
public class ConcreteACommand extends Command {

	public ConcreteACommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		super.receiver.doSomething();
	}

}
