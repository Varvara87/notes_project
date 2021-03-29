package com.itstep.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itstep.service.UserService;
import com.itstep.service.UsernameExistsException;
@Controller
@RequestMapping
public class HomeController {
	private UserService userService;
	
@Autowired
	public HomeController(UserService userService) {
		this.userService = userService;
	}
	@GetMapping
	public String index() {
		return "index.html";
		
	}
	@GetMapping("/admin_page")
	public String admin_page() {
		return "admin_page.html";
		
	}
	@GetMapping("/login")
	public String signIn() {
		return "login";
	}
	@GetMapping("/sign_up")
	public String signUp() {
		return "sign_up";
	}
	@PostMapping("/sign_up")
	public String registerNewUser(@RequestParam("username") String username,
			@RequestParam("password") String password,
	HttpServletRequest request) throws ServletException{
		try {
			userService.register(username, password);
			request.login(username, password);
			return "redirect:/login";
		} catch (UsernameExistsException e) {
			return "redirect:/signup";
		}
}
}