package com.jcg.hibernate.crud.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student implements Serializable 
{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="student_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	//variable with data types
	private int id;

	@Column(name="student_name")
	private String studentName;

	@Column(name="roll_number")
	private int rollNumber;

	@Column(name="course")
	private String course;
    
	//Creating getters and setters
	//getId
	public int getId() {
		return id;
	}
    //setId
	public void setId(int id) {
		this.id = id;
	}
    //getStudentName
	public String getStudentName() {
		return studentName;
	}
	
	//setStudentName
    public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
    //getRollNumber
	public int getRollNumber() {
		return rollNumber;
	}
    //setRollNumber
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	//getCourse
	public String getCourse() {
		return course;
	}
	//setCourse
	public void setCourse(String course) {
		this.course = course;
	}
	//Creating  toString method
	@Override
	public String toString() {
		return "Student Details?= Id: " + this.id + ", Name: " + this.studentName + ", Roll No.: " + this.rollNumber + ", Course: " + this.course;
	}
}
