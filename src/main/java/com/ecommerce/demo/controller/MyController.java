package com.ecommerce.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String webView() {
		return "login";
	}
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	 
	
}
