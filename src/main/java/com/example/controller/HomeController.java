package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/Page")
public class HomeController {
	
	@RequestMapping(value = "/index")
	public String test() {
		return "index";
	}

}
