package com.example.demo.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PercentageCalculator 
{
	@GetMapping("/data")
	public String percentage(@RequestParam String name,double mark1,double mark2,double mark3,double mark4)
	{
		
		double result=(mark1+mark2+mark3+mark4)/4;
		return "Hyy dear "+name+", Your total Percentage is ="+result+"%";
		
		
	}
	
	

}
