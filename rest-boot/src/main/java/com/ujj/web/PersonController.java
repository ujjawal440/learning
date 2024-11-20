package com.ujj.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ujj.dto.Person;
@RestController
@RequestMapping(value = "/person")
public class PersonController {
	
	@GetMapping(value = "/fetch",produces = "application/json")
	public Person getPerson() {
		Person p=new Person("George",34,"Male");
		return p;
	}
	
//	@PostMapping(value = "/save",consumes = "application/json")
//	public String savePerson(Person p) {
//		System.out.println(p);
//		return "Person saved";
//		}
	
	@PostMapping(value = "/list",consumes = "application/json")
	public List<Person> listPerson() {
		
		return Arrays.asList(new Person("Tony",24,"Male"),
				new Person("Tina",21,"Female"));
		}

}
