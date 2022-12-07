package org.tnsindia.di1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//driver class
public class DIUsingObjects {

	public static void main(String[] args) {
				//using IOC
				ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
				StudentK s1=c.getBean("s1",StudentK.class);
				
				s1.cheating();

				

	}

}
