package com.mhys.demo2;

import com.opensymphony.xwork2.Action;

/**
 * Action的编写方式二：实现Action的接口
 * @author zhj
 *
 */
public class ActionDemo2 implements Action{

	@Override
	public String execute() throws Exception {
		System.out.println("ActionDemo2");
		return null;
	}
	
}
