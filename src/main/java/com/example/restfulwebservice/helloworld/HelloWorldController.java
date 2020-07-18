package com.example.restfulwebservice.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	// GET : /hello-world (endpoint)
	// @RequestMapping(method=RequestMethod.Get, path="") = @GetMapping(path="")
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	@GetMapping("/hello-world-bean/path-variable/{name}")
	public HelloWorldBean helloWorldBeanVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hellow World, %s", name));
	}
	

}
