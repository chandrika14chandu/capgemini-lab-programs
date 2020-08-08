package com.cg.spring.demo.labbook1.b;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Client {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring2.xml");
	Employee emp=context.getBean("emp",Employee.class);
	System.out.println("Employee details");
	System.out.println("-------------------------");
	System.out.println("Employee {empAge="+emp.getAge()+", empId="+emp.getEmployeeId()+", empName="+emp.getEmployeeName()+", empSalary="+emp.getSalary()+"}");
	System.out.println("sbu details=SBU {sbuCode="+emp.getBusinessUnit().getSbuId()+", sbuHead="+emp.getBusinessUnit().getSbuHead()+", sbuName="+emp.getBusinessUnit().getSbuName()+"}");
	
}
}
