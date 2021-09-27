package com.example.restservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.restservice.model.Greeting;
import com.example.restservice.model.Response;

@Component
public class GreetingService {

	private static List<Greeting> data = new ArrayList<Greeting>();

	public List<Greeting> getAllGreetings(){
		return data;
	}

	public Greeting getGreeting(long id) throws Exception{
		for(Greeting g : data) {
			if (g.getId() == id)
				return g;
		}
		throw new Exception("Invalid Greeting id");
	}
	
	public Greeting createGreeting(long id, String content) throws Exception{
		for(Greeting g : data) {
			if (g.getId() == id)
				throw new Exception("Invalid Greeting id, already exists");
		}
		Greeting greeting = new Greeting(id, content);
		data.add(greeting);
		return greeting;
	}
	
	public Greeting updateGreeting(long id, String content) throws Exception{
		for(Greeting g : data) {
			if (g.getId() == id)
				g.setContent(content);
				return g;
		}
		throw new Exception("Invalid Greeting id");
	}
	
	public Response deleteGreeting(long id) throws Exception {
		for(Greeting g : data) {
			if (g.getId() == id)
				data.remove(g);
				return new Response(String.format("Greeting %d deleted", id));
		}
		throw new Exception("Invalid Greeting id");
	}
	
}
