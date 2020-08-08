package com.cg.Exercise;
import java.util.Scanner;
public class SalaryValidation {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Salary of an Employee:");
			float sal=sc.nextInt();
			if(sal<3000)
			{
				throw new employeeException("Employee salary should be above 3000Rs");	
			}
		}
		catch(employeeException e) {
		e.printStackTrace();
		}
	}
}
class employeeException extends Exception{
	employeeException(String msg){
		super(msg);
	}


	}
