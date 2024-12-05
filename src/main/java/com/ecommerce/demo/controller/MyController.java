package com.ecommerce.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MyController {
	
	@GetMapping("/")
	public String webView() {
		return "login";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/register")
	public String Register() {
		return "register";
	}
	
	 @GetMapping("/newpage")
	    public String newPage() {
	        return "newpage"; 
	    }
	
	@GetMapping("/cart")
	public String cart() {
		return "cart";
	}
	@GetMapping("/payment")
    public String paymentPage() {
        return "paymentpage"; // Render payment.html
    }
	
}
