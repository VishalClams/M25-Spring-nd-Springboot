package org.tnsindia.springioc;


public class Jio implements Sim{

	public void calling() {
		System.out.println("Calling using Jio");
		
	}

	public void data() {
		System.out.println("Internet using Jio");
		
	}
	public Jio() {
		super();
		System.out.println("Jio class Constructor");
	}

}
