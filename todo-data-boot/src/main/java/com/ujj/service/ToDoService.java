package com.ujj.service;

import java.util.List;

import com.ujj.entity.ToDo;

public interface ToDoService {
	
	public ToDo save(ToDo t,int uid);
	
	public ToDo fetch(int id);
	
	public List<ToDo> list();
     public ToDo update(int id);
     
//	public ToDo updateStatus(ToDo t,int id);
	
	

}
