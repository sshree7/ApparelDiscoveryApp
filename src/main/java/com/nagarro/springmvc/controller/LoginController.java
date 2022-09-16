package com.nagarro.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nagarro.springmvc.domain.User;
import com.nagarro.springmvc.service.UserLoginService;

@Controller
public class LoginController {

	@Autowired
	private UserLoginService userLoginService;

	@RequestMapping("/login")
	public String showForm(final Model model) {
		return "login";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(final @ModelAttribute User user, final Model model) {
		String nextPage = null;
		final boolean successfulLogin = userLoginService.isValidUser(user.getName(), user.getPassword());
		if (successfulLogin) {
			model.addAttribute("name", user.getName());
			nextPage = "success";
		} else {
			nextPage = "login";
		}
		return nextPage;
	}
}
