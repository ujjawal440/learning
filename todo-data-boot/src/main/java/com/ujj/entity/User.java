package com.ujj.entity;

import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Usernew")
public class User {

	@Id
	
	private int uid;
//	@Column(length=30)
	
//	@NotBlank(message = "name is mandatory")
//	@Size(min=2,max=10,message = "name is mandatory")
	
	@Pattern(regexp = "^[a-zA-Z]{2,16}$",message=" pattern doesn't matches")
	private String name;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private List<ToDo> todo;
	
	
	
	User(){
		
	}
	public User(int uid, String name, List<ToDo> todo) {
		super();
		this.uid = uid;
		this.name = name;
		this.todo = todo;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ToDo> getTodo() {
		return todo;
	}
	public void setTodo(List<ToDo> todo) {
		this.todo = todo;
	}
	
	
}
