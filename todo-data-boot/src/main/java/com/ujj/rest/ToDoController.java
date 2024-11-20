package com.ujj.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ujj.entity.ToDo;
import com.ujj.service.ToDoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/todo")
public class ToDoController {
	
	@Autowired
	private ToDoService service;
	
	@PostMapping(value = "/save/{uid}", consumes = "application/json")
	public String save(@RequestBody @Valid ToDo t,@PathVariable int uid) {
		service.save(t, uid);
		return "task saved";
		}
	
	@GetMapping(value = "/fetch",produces = "application/json")
	public ToDo fetch(int id) {
		return service.fetch(id);
	}
	
	@GetMapping(value = "/list",produces = "application/json")
	public List<ToDo> list(){
		return service.list();
	}
	
	@PutMapping(value = "/complete/{id}")
	public ToDo markTodoComplete(@PathVariable int id) {
		return service.update(id);
	}

}
