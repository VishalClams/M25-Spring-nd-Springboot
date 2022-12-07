package org.tnsindia.di;
//class
public class Student {
	
	
	//data members
	//1.DI in terms of literals
	private String Student_Name;
	private int roll_no;
	public void display()
	{
		System.out.println("The name of the student is: "+Student_Name);
		System.out.println("The RollNo of the student is: "+roll_no);

	}
	/*Achieving the Dependency by using constructor*/
	public Student(String student_Name, int roll_no) {
		super();
		Student_Name = student_Name;
		this.roll_no = roll_no;
	}
	
	
	
	/*Achieving the Dependency by using setters
	//DI using setters
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}*/
	
	
	

}
