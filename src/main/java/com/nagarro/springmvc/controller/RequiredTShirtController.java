package com.nagarro.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nagarro.springmvc.domain.TShirt;
import com.nagarro.springmvc.dto.RequiredTShirtDto;
import com.nagarro.springmvc.service.TShirtSearchService;

@Controller
public class RequiredTShirtController {
	@Autowired
	private TShirtSearchService tShirtSearchService;

	@RequestMapping("/success")
	public String showForm(Model model) {
		return "success";
	}

	@RequestMapping(path = "/tshirtform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute RequiredTShirtDto requiredTShirtDto, Model model) {
		final List<TShirt> matchedTShirts = tShirtSearchService.getMatchingTShirts(requiredTShirtDto);
		model.addAttribute("matchedTShirts", matchedTShirts);
		return "result";
	}

	@RequestMapping("/tryagain")
	public String tryAgain() {

		return "success";
	}

	@RequestMapping("/logout")
	public String logOut() {
		return "login";
	}
}
