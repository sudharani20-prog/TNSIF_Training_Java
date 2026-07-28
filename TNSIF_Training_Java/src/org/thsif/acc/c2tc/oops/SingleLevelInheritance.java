package org.thsif.acc.c2tc.oops;

//Patent class
class Course
{
	String courseName="Java Programming";
	
	void showCourse()
	{
		System.out.println("Course : "+courseName);
	}
}

//subcalss
class Student extends Course
{
	String studentName="Shree";
	void showStudent()
	{
		System.out.println("Student name: "+studentName);
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		Student student=new Student();
		student.showStudent();
		student.showCourse();

	}

}
