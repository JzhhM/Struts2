package com.mhys.struts.demo01;
/**
 * Struts2������Action
 * @author zhj
 *
 */
public class HellAction {
	/*
	 * �ṩһ������
	 * 	*����ǩ���ǹ̶��ģ����еģ�����ֵ��string���ͣ���������execute�����ܴ��ݲ���
	 */
	public String execute() {
		System.out.println("HelloActionִ����");
		return "success";
		
	}
}
