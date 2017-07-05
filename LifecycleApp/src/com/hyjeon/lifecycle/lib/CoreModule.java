package com.hyjeon.lifecycle.lib;

import java.util.ArrayList;

/**
 * 주요 모듈.
 *
 */
class CoreModule implements LifecycleObserver {

	/**
	 * 서브 모듈 구현 클래스 리스트.
	 */
	private static ArrayList<Class<SubModule>> SUB_MODULE_CLASSES = new ArrayList<>();
	
	/**
	 * 서브 모듈 구현 클래스 추가.
	 */
	public static void addSubModuleClass(Class<SubModule> cls) {
		
		if (SubModule.class.isAssignableFrom(cls)) {
			SUB_MODULE_CLASSES.add(cls);
		}
	}
	
	
	/**
	 * 서브 모듈 리스트.
	 */
	private ArrayList<SubModule> mSubModules;
	
	
	
	
	CoreModule() {
		
		this.mSubModules = new ArrayList<>();
	
		/**
		 * 서브 모듈 생성.
		 */
		for (Class<SubModule> subCls : SUB_MODULE_CLASSES) {
			
			try {
				this.mSubModules.add(subCls.newInstance());
			} catch (Exception e) {}
		}
		
	}
	
	

	@Override
	public void onCreate(Context context) {
		
		for (SubModule subMod : this.mSubModules) {
			subMod.create();
		}
	}


	@Override
	public void onDestroy(Context context) {
		
		for (SubModule subMod : this.mSubModules) {
			subMod.destroy();
		}
	}
}
