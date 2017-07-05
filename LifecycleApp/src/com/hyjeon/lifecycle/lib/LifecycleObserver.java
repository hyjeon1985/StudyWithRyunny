package com.hyjeon.lifecycle.lib;

/**
 * 라이프 사이클 관찰자 인터페이스.
 *
 */
public interface LifecycleObserver {
	
	void onCreate(Context context);
	
	
	void onDestroy(Context context);
}
