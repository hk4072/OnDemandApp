package com.application.ondemand;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminPanelLoader {

	@RequestMapping(value = "/appadmin", method = RequestMethod.GET)
	public String index(Model model) {
		return "adminPanel/home";
	}
}