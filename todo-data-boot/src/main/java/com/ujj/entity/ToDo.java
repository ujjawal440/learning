package com.ujj.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
@Entity

public class ToDo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	private String task;
	@Pattern(regexp = "[normal]",message = "enter valid priority")
	@Pattern(regexp = "[high]",message = "enter valid priority")

	@Pattern(regexp = "[low]",message = "enter valid priority")

	private String priority;
	private String status;
	private LocalDate assigneddate=LocalDate.now();
	private LocalDate finishdate;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="uid")
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getAssigneddate() {
		return assigneddate;
	}

	public void setAssigneddate(LocalDate assigneddate) {
		this.assigneddate = assigneddate;
	}

	public LocalDate getFinishdate() {
		return finishdate;
	}

	public void setFinishdate(LocalDate finishdate) {
		this.finishdate = finishdate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ToDo(int id, String task, String priority, String status, LocalDate assigneddate, LocalDate finishdate,
			User user) {
		super();
		this.id = id;
		this.task = task;
		this.priority = priority;
		this.status = status;
		this.assigneddate = assigneddate;
		this.finishdate = finishdate;
		this.user = user;
	}
	
	public ToDo() {
		this.status="Pending";
		
	}
//	public ToDo() {
//		this.assigneddate=LocalDate.now();
//		this.status="Pending";
//		
//	}
//	
	
	

}
