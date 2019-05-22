package com.mhys.demo3;

import com.opensymphony.xwork2.ActionSupport;

public class productAction extends ActionSupport {
	public String find() {
		System.out.println("²éÑ¯");
		return NONE;
	}
	public String update() {
		System.out.println("ÐÞ¸Ä");
		return NONE;
	}
	public String delete() {
		System.out.println("É¾³ý");
		return NONE;
	}
	public String save() {
		System.out.println("±£´æ");
		return NONE;
	}
}
