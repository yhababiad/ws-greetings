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


@RequestMapping("/api/v1.0/greeting")
public interface IGreetingController {
	
	@GetMapping(path= {"","/"})
	public List<Greeting> getAllGreetings();
	
	@GetMapping("/{id}")
	public Greeting getGreeting(@PathVariable(value = "id") Long id) throws Exception;
	
	@PostMapping("")
	public Greeting createGreeting(@RequestParam(value = "id", required=false) Long id, @RequestParam(value = "content") String content) throws Exception;
		
	@PutMapping("/{id}")
	public Greeting updateGreeting(@PathVariable(value = "id") Long id, @RequestParam(value = "content") String content) throws Exception;
	
	
	@DeleteMapping("/{id}")
	public Response deleteGreeting(@PathVariable(value = "id") Long id) throws Exception ;

	
}
