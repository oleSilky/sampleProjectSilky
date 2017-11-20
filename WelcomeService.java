package com.silky.springboot.first_springboot_project.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService{
	
	public String hello(){
		return "hello guys we have created appand updated with annotations  !! hurray !!!";
	}
}