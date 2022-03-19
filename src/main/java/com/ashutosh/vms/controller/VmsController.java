package com.ashutosh.vms.controller;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ashutosh.vms.entity.Customer;
import com.ashutosh.vms.entity.User;
import com.ashutosh.vms.entity.Vehicle;
import com.ashutosh.vms.service.CustomerService;
import com.ashutosh.vms.service.UserService;
import com.ashutosh.vms.service.VehicleService;

@Controller
public class VmsController {

	final String SU_CODE = "1A2B3C";
	List<User> userList = new ArrayList<>();
	List<Customer> customerList = new ArrayList<>();
	List<Vehicle> vehicleList = new ArrayList<>();


	@Autowired
	UserService userService;
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	VehicleService vehicleService;

	@GetMapping("/")
	public String indexPage(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}

	@PostMapping("/login")
	public String adminPage(@ModelAttribute("user") User user,	HttpServletRequest  request, Model model) {
		System.out.println("**********************" + user + "**********************************");
		
		userList = userService.getAllUsers();
		customerList = customerService.getAllCustomers();
		vehicleList = vehicleService.getAllVehicles();
		
		model.addAttribute("users",userList);
		model.addAttribute("customer",customerList);
		model.addAttribute("vehicle",vehicleList);

		
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
	
	@GetMapping("/add_customer")
	public String invokeAddCustomer(Model model) {
		model.addAttribute("customer",new Customer());
		model.addAttribute("vehicle",new Vehicle());
		
		model.addAttribute("customerList",customerService.getAllCustomers());
		model.addAttribute("vehicleList", vehicleService.getAllVehicles());
		return "add_customer";
	}
	
	@PostMapping("/customer_added")
	public String customerAdded(@ModelAttribute("customer") Customer customer, Model model) {
		System.out.println(customer);
		customerService.saveCustomer(customer);
		model.addAttribute("customerList",customerService.getAllCustomers());
		model.addAttribute("vehicleList", vehicleService.getAllVehicles());
		return "add_customer";
	}
	
	@PostMapping("/vehicle_added")
	public String vehicleAdded(@ModelAttribute("vehicle") Vehicle vehicle) {
		System.out.println(vehicle);
		vehicleService.saveVehicle(vehicle);
		return "add_customer";
	}
	
	
	@GetMapping("/add_services")
	public String invokeAddServices() {
		return "add_services";
	}

}
