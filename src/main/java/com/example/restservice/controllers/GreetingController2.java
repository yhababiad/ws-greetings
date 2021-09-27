package com.example.restservice.controllers;

import java.util.ArrayList;
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
import com.example.restservice.model.ResultDto;
import com.example.restservice.services.GreetingService;


@RequestMapping("/api/v2.0/greeting")
@RestController
public class GreetingController2 implements IGreetingController {
	
	@Autowired
	private GreetingService service;


	@Override
	public ResultDto<Greeting> getAllGreetings(){
		//return service.getAllGreetings();
		//List<Greeting> data = new ArrayList<Greeting>();
		Greeting g = new Greeting(0, "new greeting 2");	
		List<Greeting> list=new ArrayList<Greeting>();
		ResultDto<Greeting> dto=new ResultDto<Greeting>();
		list.add(g);
		dto.setGreetings( list);
		dto.setCount(1L);
		return dto;
		
	}

	@Override
	public ResultDto<Greeting> getGreeting( long id) throws Exception{
		//return service.getGreeting(id);
		List<Greeting> list=new ArrayList<Greeting>();
		ResultDto<Greeting> dto=new ResultDto<Greeting>();
		list.add(service.getGreeting(id));
		dto.setGreetings( list);
		dto.setCount(1L);
		return dto;
	}
	
	@Override
	public ResultDto<Greeting> createGreeting( long id,  String content) throws Exception{
		//return service.createGreeting(id, content);
		List<Greeting> list=new ArrayList<Greeting>();
		ResultDto<Greeting> dto=new ResultDto<Greeting>();
		list.add(service.createGreeting(id, content));
		dto.setGreetings( list);
		dto.setCount(1L);
		return dto;
	}
	
	@Override
	public ResultDto<Greeting> updateGreeting( long id, String content) throws Exception{
		//return service.updqteGreeting(id, content).;
		List<Greeting> list=new ArrayList<Greeting>();
		ResultDto<Greeting> dto=new ResultDto<Greeting>();
		list.add(service.updateGreeting(id, content));
		dto.setGreetings( list);
		dto.setCount(1L);
		return dto;
	}
	
	@Override
	public ResultDto<Greeting> deleteGreeting( long id) throws Exception {
		ResultDto<Greeting> dto=new ResultDto<Greeting>();
		dto.setMessage( service.deleteGreeting(id).getMessage());
		dto.setCount(0L);
		return dto;
	}
	
}
