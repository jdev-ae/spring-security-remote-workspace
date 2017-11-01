package com.suru.springtest.security.userapp1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/home")
	public String showHome() {

		return "home";
	}

	@RequestMapping("/showMessage")
	public String showMessage() {
		return "showMessage";
	}

	@RequestMapping("/admin/users.html")
	public String showUsers() {
		return "users";
	}

	@RequestMapping("/login.html")
	public String showLogin() {
		return "login";
	}

	@RequestMapping("/authenticated.html")
	public String showLoginSuccess() {
		return "authenticated";
	}

}
