package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringStarterProjectApplication {

	public static void main(String[] args) {
		
		/*int x=20;
		System.out.println("The value of x is: "+x);*/
		
		/*Student s=new Student();
		s.print();*/
		
		
		//IOC and DI
		ConfigurableApplicationContext c=SpringApplication.run(SpringStarterProjectApplication.class, args);
		Student e=c.getBean(Student.class);
		e.print();
	}

}
