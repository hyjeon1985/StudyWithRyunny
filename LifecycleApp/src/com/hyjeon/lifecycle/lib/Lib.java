package com.hyjeon.lifecycle.lib;

import com.hyjeon.lifecycle.lib.a.SubModuleA;
import com.hyjeon.lifecycle.lib.b.SubModuleB;

public final class Lib {


	/**
	 * 라이르러리 구동.
	 */
	public static final void doSomething() {
		// 메인영역
		Context context = new Context();
		context.setOnCreateStateAction(new SubModuleA());
		context.setOnDestroyStateAction(new SubModuleB());
		context.start();
	}
	
}
