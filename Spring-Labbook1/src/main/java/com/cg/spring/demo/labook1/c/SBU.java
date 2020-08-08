package com.cg.spring.demo.labook1.c;
import java.util.List;
public class SBU {
private String sbuCode;
private String sbuName;
private String sbuHead;
private List<Employee> emplist;
public String getSbuCode() {
	return sbuCode;
}
public void setSbuCode(String sbuCode) {
	this.sbuCode = sbuCode;
}
public String getSbuName() {
	return sbuName;
}
public void setSbuName(String sbuName) {
	this.sbuName = sbuName;
}
public String getSbuHead() {
	return sbuHead;
}
public void setSbuHead(String sbuHead) {
	this.sbuHead = sbuHead;
}
public List<Employee> getEmplist() {
	return emplist;
}
public void setEmplist(List<Employee> emplist) {
	this.emplist = emplist;
}
}
