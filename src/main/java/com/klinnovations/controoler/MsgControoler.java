package com.klinnovations.controoler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgControoler {
	
	@GetMapping("/welcome")
	
	public String getWelcomeMsg(Model model) {
		model.addAttribute("msg", "Welcome to Thymeleaf Pages");
		return "index";
	}
	
	
@GetMapping("/greet")
	
	public String getGreetMsg(Model model) {
		model.addAttribute("msg","Good Evening...");
		return "index";
}
}
