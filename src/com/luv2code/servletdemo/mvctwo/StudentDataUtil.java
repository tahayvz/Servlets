package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {	//Model class

	public static List<Student>getStudents(){
		
		//create an empty list 
		List<Student> students=new ArrayList<>();
		
		//add sample data
		students.add(new Student("Ali","Bilir","ali@bilir.com"));
		students.add(new Student("Mehmet","Bilir","mehmet@bilir.com"));
		students.add(new Student("Ayse","Bilir","ayşe@bilir.com"));

		//return the list
		return students;
	}
}
