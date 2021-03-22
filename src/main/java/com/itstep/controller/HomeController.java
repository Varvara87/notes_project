package com.itstep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping
	public String index() {
		return "index.html";
		
	}
	@GetMapping("/admin_page")
	public String admin_page() {
		return "admin_page.html";
		
	}

}
