package org.egovframe.lab.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
	
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("context-*.xml");
		HelloService helloService = context.getBean("helloService", HelloService.class);

		for (int i = 0; i < 30; i++) {
			System.out.println("RESULT="+helloService.sayHello());
		}
	}

}
