package com.example.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
@RequestMapping(value = "/Page")
public class HomeController {
	
	@RequestMapping(value = "/index")
	public String test() {
		return "index";
	}

}
