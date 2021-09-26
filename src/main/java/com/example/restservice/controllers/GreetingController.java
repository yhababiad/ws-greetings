package com.example.restservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.model.Greeting;
import com.example.restservice.model.Response;
import com.example.restservice.services.GreetingService;

@RestController
@RequestMapping("/api/v1.0/greeting")
public class GreetingController {
	
	@Autowired
	private GreetingService service;


	@GetMapping("/")
	public List<Greeting> getAllGreetings(){
		return service.getAllGreetings();
	}

	@GetMapping("/{id}")
	public Greeting getGreeting(@PathVariable(value = "id") long id) throws Exception{
		return service.getGreeting(id);
	}
	
	@PostMapping("/")
	public Greeting createGreeting(@RequestParam(value = "id") long id, @RequestParam(value = "content") String content) throws Exception{
		return service.createGreeting(id, content);
	}
	
	@PutMapping("/{id}")
	public Greeting updqteGreeting(@PathVariable(value = "id") long id, @RequestParam(value = "content") String content) throws Exception{
		return service.updqteGreeting(id, content);
	}
	
	@DeleteMapping("/{id}")
	public Response deleteGreeting(@PathVariable(value = "id") long id) throws Exception {
		return service.deleteGreeting(id);
	}
	
}
