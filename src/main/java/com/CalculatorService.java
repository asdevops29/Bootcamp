package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
	
	@GetMapping("/addition")
	public int addition()
	{
		return 20+10;
	}
	
	@GetMapping("/subtraction")
	public int subtraction()
	{
		return 20-10;
	}
	
	@GetMapping("/multiplication")
	public int multiplication()
	{
		return 20*10;
	}
	
	@GetMapping("/division")
	public int division()
	{
		return 20/10;
	}
	
	@GetMapping("/modulus")
	public int modulus()
	{
		return 20%10;
	}
	
}
