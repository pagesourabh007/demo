package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {

	
@RequestMapping("/")
public String Index() {
	return "new";
}



@RequestMapping("/new")
public String new1() {
	return "new";
}

@RequestMapping("/registration")
public String regs() {
	return "registration";
}
	}
