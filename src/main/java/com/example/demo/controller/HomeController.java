package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping({"/","/index","home"})
	public String index() {
		return "home";
	}
	
	@GetMapping("/template")
	public String index2() {
		return "plantilla/template";
	}

}
