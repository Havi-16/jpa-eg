package com.springjpa.model;
import jakarta.persistence.*;

@Entity
@Table(name="student1")
public class StudentModel {

	@Id
	private int rno;
	private String name;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "User [rno =" +rno+",name= "+name+"]";
	}
	
}
