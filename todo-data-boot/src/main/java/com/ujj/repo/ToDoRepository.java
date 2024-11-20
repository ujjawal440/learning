package com.ujj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ujj.entity.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Integer>{
	
	

}
