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

public class GreetingController implements IGreetingController {
	
	@Autowired
	private GreetingService service;


	@Override
	public List<Greeting> getAllGreetings(){
		return service.getAllGreetings();
	}

	@Override
	public Greeting getGreeting( long id) throws Exception{
		return service.getGreeting(id);
	}
	
	@Override
	public Greeting createGreeting( long id,  String content) throws Exception{
		return service.createGreeting(id, content);
	}
	
	@Override
	public Greeting updqteGreeting( long id, String content) throws Exception{
		return service.updqteGreeting(id, content);
	}
	
	@Override
	public Response deleteGreeting( long id) throws Exception {
		return service.deleteGreeting(id);
	}
	
}
