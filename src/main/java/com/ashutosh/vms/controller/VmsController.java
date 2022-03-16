package com.ashutosh.vms.controller;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ashutosh.vms.entity.User;
import com.ashutosh.vms.service.UserService;

@Controller
public class VmsController {
	
	final String SU_CODE = "1A2B3C"; 
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String indexPage(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}

	@PostMapping("/login")
	public String adminPage(@ModelAttribute("user") User user){
		System.out.println("**********************" + user + "**********************************");
		if(user.getsuperUserCode().equals(SU_CODE)) {
			return "admin_home";
		}else {
			return "service_advisor_home";
		}
		
	}

	@PostMapping("/register")
	public String registerPage(@ModelAttribute("user") User user) {
		System.out.println("**********************" + user + "**********************************");
		userService.saveUser(user);
		return "redirect:/";
	}

}
