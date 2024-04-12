package com.springDemo.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRemote {
	

	public static void main(String[] args) {
		//ServiceProvider sp=new ServiceProvider();
		//String msg=sp.getConnection();
		//System.out.println(msg);
		try {
			
			//Using ApplicationContext
			//@SuppressWarnings("resource")
			ApplicationContext cntx=new ClassPathXmlApplicationContext("com/springDemo/SpringCore/appContext.xml");
			
			System.out.println("Xml is loded.......");
	           RemoteMaster	rmstr=(RemoteMaster) cntx.getBean("obj");
	           rmstr.channalChange();
	           rmstr.colourChange();
			

			
		}catch(Exception e){
			
			e.printStackTrace();			
		}
		

	}

}
