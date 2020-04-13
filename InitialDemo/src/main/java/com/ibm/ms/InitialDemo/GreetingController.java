package com.ibm.ms.InitialDemo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingController {

	//@Value("${greetprop}")
	//private String greetProp;

	@RequestMapping(path = "/default", method = RequestMethod.GET)
	public String getDefaultMessage() {
		return "Hello World!";
	}

	
}
