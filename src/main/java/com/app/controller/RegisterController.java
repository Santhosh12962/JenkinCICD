package com.app.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Register;
import com.app.service.RegisterService;

@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("api/register")
public class RegisterController {
	
	 @Autowired
	 private RegisterService registerService;
	 
	 @PostMapping
	 public String Validate(@RequestBody Register data ) {
			return registerService.addRegister(data);	
	}
		
	
	  

}
