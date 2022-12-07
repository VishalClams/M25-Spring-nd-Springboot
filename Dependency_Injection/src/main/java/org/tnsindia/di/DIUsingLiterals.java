package org.tnsindia.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//driver class
public class DIUsingLiterals {

	public static void main(String[] args) {
		//hard coding
		//Student s=new Student();
		//s.setStudent_Name("Rutvik k");
		//s.display();
		
		//using IOC
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Student s1=c.getBean("s1",Student.class);
		//Student s2=c.getBean("s2",Student.class);

		s1.display();
		//s2.display();

		

	}

}
