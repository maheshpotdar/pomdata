package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eid;

	@Column(name = "ename")
	private String ename;

	@Column(name = "email")
	private String email;

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", salary=" + salary + "]";
	}

	@Column(name = "salary")
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(Integer eid, String ename, String email, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.salary = salary;
	}

}
