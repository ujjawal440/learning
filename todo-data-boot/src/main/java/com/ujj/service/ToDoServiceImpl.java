package com.ujj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ujj.entity.ToDo;
import com.ujj.entity.User;
import com.ujj.repo.ToDoRepository;
@Service
public class ToDoServiceImpl implements ToDoService{
	
	@Autowired
	private ToDoRepository repo;
	@Autowired
	private UserService service;

	
	

	@Override
	public ToDo save(ToDo t, int uid) {
		User u=service.fetch(uid);
		t.setUser(u);
		return repo.save(t);
		
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public ToDo fetch(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public List<ToDo> list() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

//	@Override
//	public void update(ToDo n, int id) {
//		
//		User t=service.fetch(id);
//		n.setUser(t);
//		repo.save(n);
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public ToDo update(int id) {
		ToDo t=repo.findById(id).orElse(null);
		t.setStatus("completed");
		return repo.save(t);
		
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public ToDo updateStatus(ToDo t, int id) {
//		User u=service.fetch(id); 
//	
//		// TODO Auto-generated method stub
//		return null;
//	}

	
}
