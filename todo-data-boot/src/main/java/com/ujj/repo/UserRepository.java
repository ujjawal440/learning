package com.ujj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ujj.entity.User;


public interface UserRepository extends JpaRepository<User, Integer>{

}
