package Org.student;

import Org.Department.Department;

public class Student extends Department{

	public static void studentName()
	{
		System.out.println("Student Name Printed");
	}
	public static void studentDept()
	{
		System.out.println("Student Dept Printed");
	}
	public static void studentID()
	{
		System.out.println("Student ID Printed");	
	}
	public static void main(String[] args) {
		Department dep1 = new Department();
		dep1.collegeCode();
		dep1.collegeName();
		dep1.collegeRank();
		dep1.departmentName();
		studentDept();
		studentID();
		studentName();
		
}
}