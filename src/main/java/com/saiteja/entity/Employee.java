package com.saiteja.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int id;
	private String name;
	private int age;
	private int marks;
	private String city;
	private String mobileNumber;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int age, int marks, String city, String mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.city = city;
		this.mobileNumber = mobileNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + ", city=" + city
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	
	

}
