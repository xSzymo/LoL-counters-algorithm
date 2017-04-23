package xszymo.controllers;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.stereotype.Controller;

@Controller
public class Start {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		return "welcome";
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String printWelcome1(ModelMap model) {
		return "welcome";
	}
	
	@RequestMapping("team")
	public String halo(ModelMap model) {
		return "team";		
	}
	
	@RequestMapping("oneChampion")
	public String hal1o(ModelMap model) {
		return "oneChamp";		
	}	
}
