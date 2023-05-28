package com.jenkins.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jenkinsCls {
	
	@GetMapping("/")
	public String test()
	{
		
		return "My jenkins teset";
	}

}
