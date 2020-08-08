package com.cg.Exercise;
import java.util.Scanner;
public class AgeValidation {
	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Age of an Employee:");
			int age=s.nextInt();
			if(age<15)
			{
				throw new ageException("Employee Age should be above 15Yrs");	
			}
		}
		catch(ageException e) {
			//System.out.println(e);
			e.printStackTrace();
		}
	}
}
class ageException extends Exception{
	ageException(String msg){
		super(msg);
	}

}
