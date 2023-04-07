package com.thymeleafdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("message","Gaya3");
		return "helloworld";
		
	}
	@GetMapping("/menu")
	public String menu() {
		//model.addAttribute("message","***April Fool***");
		return "menu";
		
	}
	
}
//<div Display="flex" Flex-direction="row" Justify-content="between">