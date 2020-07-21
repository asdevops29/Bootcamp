package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaySomethingService {
	
	@GetMapping("/morning")
	public String sayMorning() {
		return "Good Morning!";
	}
	
	@GetMapping("/afternoon")
	public String sayAfternoon() {
		return "Good Afternoon!";
	}
	
	@GetMapping("/nigh")
	public String sayNight() {
		return "Good Night!";
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello!";
	}
	
	@GetMapping("/something/{idMsg}")
	public String saySomething(@PathVariable("idMsg") String msg) {
		return msg;
	}
	
}
