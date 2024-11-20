package com.ujj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ujj.entity.User;
import com.ujj.repo.UserRepository;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository repo;
	@Override
	public void save(User u) {
		repo.save(u);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public User fetch(int uid) {
		// TODO Auto-generated method stub
		return repo.findById(uid).get();
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void remove(int uid) {
		repo.deleteById(uid);
		// TODO Auto-generated method stub
		
	}

	@Override
	public User updateName(int uid) {
		
		User u=repo.findById(uid).orElse(null);
		u.setName("null0");
		return repo.save(u);
		// TODO Auto-generated method stub
		
	}

}
