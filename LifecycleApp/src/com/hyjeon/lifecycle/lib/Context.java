package com.hyjeon.lifecycle.lib;

/**
 * Context
 * 
 * - 일반적인 어플리케이션 라이프사이클 모방.
 * 
 * @author Gitden
 *
 */
class Context extends Thread {
	
	/**
	 * 수명.
	 */
	private static final long LIFESPAN = 6000;
	
	
	
	
	/**
	 * 핵심 주요 모듈.
	 */
	private CoreModule mCore = new CoreModule();
	
	
	
	@Override
	public void run() {
	
		this.onCreate();

		try {
			Thread.sleep(LIFESPAN);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.onDestroy();
	}
	
	
	
	
	private void onCreate() {
		this.mCore.onCreate(this);
	}
	
	
	private void onDestroy() {
		this.mCore.onDestroy(this);
	}
}
