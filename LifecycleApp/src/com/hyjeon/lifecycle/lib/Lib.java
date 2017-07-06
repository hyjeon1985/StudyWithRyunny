package com.hyjeon.lifecycle.lib;

public final class Lib {


	static {
		doSomething();
	}
	/**
	 * 라이르러리 구동.
	 */
	private static final void doSomething() {
		Context context = new Context();
		context.start();
	}
	
}
