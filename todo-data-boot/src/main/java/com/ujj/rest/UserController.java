package com.ujj.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ujj.entity.User;
import com.ujj.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping(value = "/save", consumes = "application/json")
	public ResponseEntity<String> save(@RequestBody @Valid User u,BindingResult result
			) {
		if (result.hasErrors()) {
	        StringBuilder errorMessages = new StringBuilder("Validation failed: ");
	        result.getAllErrors().forEach(error -> {
	            errorMessages.append(error.getDefaultMessage()).append(", ");
	        });
	        // Remove the last comma and space
	        String errors = errorMessages.toString().substring(0, errorMessages.length() - 2);
	        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);  // Return validation errors
	    }
 		service.save(u);
	
		return ResponseEntity.ok("User saved");
	}
	
	@GetMapping(value = "/fetch",produces = "application/json")
	public User fetch(int uid) {
		return service.fetch(uid);
	}
	
	@GetMapping(value = "/list",produces = "application/json")
	public List<User> list(){
		return service.list();
	}
	
	@PutMapping(value = "/noname/{uid}")
	public User makeNameNull(@PathVariable int uid) {
		return service.updateName(uid);
	}

}
