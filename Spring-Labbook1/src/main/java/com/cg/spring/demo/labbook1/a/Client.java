package com.cg.spring.demo.labbook1.a;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Client {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
	Employee emp=context.getBean("emp",Employee.class);
	System.out.println("Employee details\n-------------------------\nEmployee ID : "+emp.getEmployeeId()+"\nEmployee Name : "+emp.getEmployeeName()+"\nEmployee Salary : "
			+emp.getSalary()+"\nEmployee BU : "+emp.getBusinessUnit()+"\nEmployee Age : "+emp.getAge());
	
	
}
}
