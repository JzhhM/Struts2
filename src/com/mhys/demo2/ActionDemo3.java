package com.mhys.demo2;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Action的编写方式3：Action类继承ActionSupport类
 * @author zhj
 * 		*推荐使用继承ActionSupport的方式
 * 			*ActionSupport中提供了数据校验，国际化
 *
 */
public class ActionDemo3 extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ActionDemo3");
		return null; //super.execute();默认返或success
	}
}
