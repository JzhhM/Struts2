package com.mhys.demo2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Action�ı�д��ʽ3��Action��̳�ActionSupport��
 * @author zhj
 * 		*�Ƽ�ʹ�ü̳�ActionSupport�ķ�ʽ
 * 			*ActionSupport���ṩ������У�飬���ʻ�
 *
 */
public class ActionDemo3 extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ActionDemo3");
		return null; //super.execute();Ĭ�Ϸ���success
	}
}
