package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Airlines")
public class entity {
	@Id
	private int id;
	private String PassengerName;
	private int classtype;
	private int ph ;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassengerName() {
		return PassengerName;
	}
	public void setPassengerName(String passengerName) {
		PassengerName = passengerName;
	}
	public int getClasstype() {
		return classtype;
	}
	public void setClasstype(int classtype) {
		this.classtype = classtype;
	}
	public int getPh() {
		return ph;
	}
	public void setPh(int ph) {
		this.ph = ph;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public entity(int id, String passengerName, int classtype, int ph, int age) {
		super();
		this.id = id;
		PassengerName = passengerName;
		this.classtype = classtype;
		this.ph = ph;
		this.age = age;
	}
public entity()
{
	
}
}
	 