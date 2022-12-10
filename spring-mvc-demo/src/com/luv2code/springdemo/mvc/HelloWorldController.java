package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm") 
	public String showForm(){ 
		return "helloworld-form"; 
	}
	
	@RequestMapping("/processForm") 
	public String processForm(){ 
		return "helloworld"; 
	}
	
	@RequestMapping("/processFormVersionTwo")  
	public String letsShoutDude(HttpServletRequest request, Model model){  

		//read the request parameter from the html form 
	
		String theName = request.getParameter("studentName"); 
	
		//convert the data to all caps 
	
		theName = theName.toUpperCase(); 
	
		//create the message 
	
		String result = "Yo!" + theName; 
	
		//add message to the model 
	
		model.addAttribute("message",result); 
	
		return "helloworld";  

	} 

	 

}
