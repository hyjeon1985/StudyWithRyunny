package com.hyjeon.lifecycle.lib.a;
import com.hyjeon.lifecycle.lib.SubModule;

public class SubModuleA implements SubModule {
	
	@Override
	public void create() {
		
		System.out.println("Sub module A is created!");
	}

	@Override
	public void destroy() {
		
		System.out.println("Sub module A is destroyed!");
	}

}
