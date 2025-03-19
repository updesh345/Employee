package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee
{

	@Id
	private int eid;
	private String edept;
	private double esalary;
		
	public Employee() {
		super();
		
	}
public Employee(int eid, String edept, double esalary) {
		super();
		this.eid = eid;
		this.edept = edept;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEdept() {
		return edept;
	}
public void setEdept(String edept) {
		this.edept = edept;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	
	
	
}