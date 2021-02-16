package org.project.restapi.student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private String regno;
	private String name;
	private String course;
	private String semester;
	
	
	public Student() { }
	public Student(String regno, String name, String course, String semester) {
		super();
		this.regno = regno;
		this.name = name;
		this.course = course;
		this.semester = semester;
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	@Override
	public String toString() {
		return "Student [regno=" + regno + ", name=" + name + ", course=" + course + ", semester=" + semester + "]";
	}

}
