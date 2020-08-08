package com.cg.spring.demo.labook1.c;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Client {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring3.xml");
	SBU sbu=context.getBean("sbu",SBU.class);
	System.out.println("SBU Details");
	System.out.println("----------------------------");
	System.out.println("sbuCode="+sbu.getSbuCode()+", sbuHead="+sbu.getSbuHead()+", sbuName="+sbu.getSbuName());
	System.out.println("Employee details:----------------");
	System.out.print("[");
	List<Employee> emp=sbu.getEmplist();
	for(Employee data:emp){
		System.out.print("Employee [");
		System.out.println("[empAge="+data.getAge()+", empId="+data.getEmployeeId()+", empName="+data.getEmployeeName()+", empSalary="+data.getSalary()+"]");
		if(emp.indexOf(data)!=emp.size()-1){
			System.out.print(",");
		}
	}
	System.out.print("]");
}
}
