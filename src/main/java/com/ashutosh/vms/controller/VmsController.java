package com.ashutosh.vms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VmsController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/admin")
	public String adminHome() {
		return "admin_home";
	}
	
}
