package com.mhys.struts.demo01;
/**
 * Struts2的入门Action
 * @author zhj
 *
 */
public class HellAction {
	/*
	 * 提供一个方法
	 * 	*方法签名是固定的，共有的，返回值是string类型，方法名是execute，不能传递参数
	 */
	public String execute() {
		System.out.println("HelloAction执行了");
		return "success";
		
	}
}
