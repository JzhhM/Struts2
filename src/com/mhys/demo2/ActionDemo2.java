package com.mhys.demo2;

import com.opensymphony.xwork2.Action;

/**
 * Action�ı�д��ʽ����ʵ��Action�Ľӿ�
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
