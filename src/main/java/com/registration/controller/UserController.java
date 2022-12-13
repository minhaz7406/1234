package com.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.registration.entites.User;
import com.registration.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//handler method- bcz it handles the incoming request from the view.
	@GetMapping("/viewUserPage")
	public String viewCreateUserPage() {
		return "create_user";
	}
	
	@PostMapping("/saveUsers")
	public String saveUser(@ModelAttribute("user") User U) {
		userService.saveOneUser(U);
		return "create_user";
	}

}
