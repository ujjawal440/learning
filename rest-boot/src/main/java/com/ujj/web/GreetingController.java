package com.ujj.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@GetMapping(value = "/")
	public String sayHello() {
		return "Hello from spring boot";
	}

	@GetMapping(value="/{naam}")
	public String sayHello(@PathVariable("naam") String name) {
		return "Hello and welcome "+ name;
	}
	
	@GetMapping(value="/bye")
	public String sayBye(@RequestParam("naam") String name) {
		
		return "Asta la vista " + name;
	}
	
//	@PostMapping("/")
//	public String restput() {
//		return "Rest put request";
//	}
//	@PostMapping("/")
//	public String restpost() {
//		return "Rest post request";
//	}
//	
//	@PostMapping("/")
//		public String restDel() {
//			return "Rest delete request";
//		}
	}

