package com.jt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//次注解相当于@Controller+@ResponseBody
public class UserController01 {
	@RequestMapping("/hellos")
	public String hello() {
		
		return "helloWorld!!!!";
	}
}
