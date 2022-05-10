package com.yjj.spring_8_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		adminConnection adminConn1 = ctx.getBean("adminConn", adminConnection.class);
		
		System.out.println(adminConn1.getAdminId());
		System.out.println(adminConn1.getAdminPw());
		System.out.println(adminConn1.getSub_adminId());
		System.out.println(adminConn1.getSub_adminPW());
		
		
		ctx.close();
		
		
		
	}

}
