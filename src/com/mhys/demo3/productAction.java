package com.mhys.demo3;

import com.opensymphony.xwork2.ActionSupport;

public class productAction extends ActionSupport {
	public String find() {
		System.out.println("��ѯ");
		return NONE;
	}
	public String update() {
		System.out.println("�޸�");
		return NONE;
	}
	public String delete() {
		System.out.println("ɾ��");
		return NONE;
	}
	public String save() {
		System.out.println("����");
		return NONE;
	}
}
