package com.ashutosh.vms.controller;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;

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
	List<User> userList = new ArrayList<>();

	@Autowired
	UserService userService;

	@GetMapping("/")
	public String indexPage(Model model, HttpSession httpSession) {
		model.addAttribute("user", new User());
		return "index";
	}

	@PostMapping("/login")
	public String adminPage(@ModelAttribute("user") User user) {
		System.out.println("**********************" + user + "**********************************");
		userList = userService.getAllUsers();

		for (User user_individual : userList) {
			
			if (user_individual.getUser_name().equals(user.getUser_name())) {

				if (user_individual.getsuperUserCode().equals(SU_CODE)) {

					return "admin_home";
				} else {
					return "service_advisor_home";
				}
			}
		}

		return "redirect:/";
	}

	@PostMapping("/register")
	public String registerPage(@ModelAttribute("user") User user) {
		System.out.println("**********************" + user + "**********************************");
		userService.saveUser(user);
		return "redirect:/";
	}

}
