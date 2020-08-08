package com.cg.Exercise;
import java.util.Scanner;
public class ValidateNameOfEmployee {
	public static void main(String[] args) {
		try {
			System.out.println("Enter Name of an Employee:");
			Scanner sc=new Scanner(System.in);
			String firstName=sc.nextLine();
			String lastName=sc.nextLine();
			if(firstName.length()==0 && lastName.length()==0)
			{
				throw new MyException("Employee First and Last name is blank");
			}
			}
			catch(MyException e) {
				e.printStackTrace();
			}
		}
	}
	class MyException extends Exception{
		MyException(String msg){
			super(msg);
		}
	}
