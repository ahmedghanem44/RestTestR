package com.project.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column
	private int id;//id 
	
	@Column(name="First_Name")
	private String fname;
	
	@Column(name= "Last_Name")
	private String lname;
	
	@Column
	private double mark;
	
	public Student() {}

	public Student(int id, String fname, String lname, double mark) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.mark = mark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}
	
	
	
	
}
