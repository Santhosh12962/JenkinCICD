package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Login;
import com.app.service.LoginService;

@RestController
@RequestMapping("api/login")
@CrossOrigin("http://localhost:5173")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping
	public String validateData(@RequestBody Login data) {
		return loginService.validateLogin(data.getUname(), data.getPassword());
	}

	

}

