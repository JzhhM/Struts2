package com.mhys.demo2;

import com.opensymphony.xwork2.Action;

/**
 * Action的编写方式二：实现Action的接口
 * 	实现接口的方式：提供了5个常量（5个逻辑视图名称）
 * 		*SUCCESS :成功
 * 		*ERROR ：失败
 * 		*LOGIN ：登陆出错页面跳转
 * 		*INPUT : 表单验证的时候出错
 * 		*NONE  ：不跳转
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
