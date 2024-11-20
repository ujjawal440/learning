package com.ujj.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;

@RestController
public class ContentController {

	
	@GetMapping(value="/greet/{name}",produces="text/plain")
	public String greetText(@PathVariable String name) {
		return "Text: Welcome to spring boot ,  "+name;
	}
	
	@GetMapping(value="/greet2",produces="text/html")
	public String greetHtml(@RequestParam String name) {
		return "<h1>HTML: welcome to spring boot, "+name+"</h1>";
	}
	@GetMapping(value="/greet3",produces="text/xml")
	public String greetXml() {
		return "<?xml version=\"1.0\"><greeting>Welcome to spring Boot</greeting>";
	}
	@GetMapping(value="/greet4",produces="application/json")
	public String greetJson() {
		JSONPObject obj=new JSONPObject("greeting", "welcome to spring boot");
		return obj.getValue().toString();
	}
	
	@GetMapping(value="/greet5")
	public String newee() {
		JSONPObject j=new JSONPObject("nwnew", "hdskds");
		return j.getValue().toString();
		
	}
}
