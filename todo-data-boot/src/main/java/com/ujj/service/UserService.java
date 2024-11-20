package com.ujj.service;

import java.util.List;

import com.ujj.entity.User;

public interface UserService {

	
	public void save(User u);
	
	public User fetch(int uid);
	
	public List<User> list();
	
	public void remove(int uid);
	
	public User updateName(int uid);
}
