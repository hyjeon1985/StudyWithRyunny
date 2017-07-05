package com.hyjeon.lifecycle.lib.b;

import com.hyjeon.lifecycle.lib.SubModule;

public class SubModuleB implements SubModule {

	@Override
	public void create() {
		System.out.println("Sub module B is created!");
		
	}

	@Override
	public void destroy() {
		System.out.println("Sub module B is destroyed!");
		
	}

}
