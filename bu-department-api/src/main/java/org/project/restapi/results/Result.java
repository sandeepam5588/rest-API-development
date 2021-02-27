package org.project.restapi.results;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.project.restapi.model.Subject;


@Entity
public class Result {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String regno;
	private String studentName;
	private String course;
	private String semester;
	private Date dateOfAnnouncement;
//	@OneToMany(cascade = CascadeType.ALL)
//	private Collection<Subject> subjects = new ArrayList<Subject>();
	@ElementCollection
	private Set<Subject> subjects = new HashSet<Subject>();
	private String resultStatus;
	
	public Result() {}

	public Result(Long id, String regno, String studentName, String course, String semester, Date dateOfAnnouncement,
			Set<Subject> subjects, String resultStatus) {
		super();
		this.id = id;
		this.regno = regno;
		this.studentName = studentName;
		this.course = course;
		this.semester = semester;
		this.dateOfAnnouncement = dateOfAnnouncement;
		this.subjects = subjects;
		this.resultStatus = resultStatus;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public Set<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<Subject> subjects) {
		this.subjects = subjects;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public Date getDateOfAnnouncement() {
		return dateOfAnnouncement;
	}
	public void setDateOfAnnouncement(Date dateOfAnnouncement) {
		this.dateOfAnnouncement = dateOfAnnouncement;
	}
	
	public String getResultStatus() {
		return resultStatus;
	}
	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}
	

}
