package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Register;
import com.app.repository.RegisterRepository;

@Service
public class LoginService {
    @Autowired
    private RegisterRepository registerRepository;

    public String validateLogin(String uname, String password) {
        Register user = registerRepository.findByUserName(uname);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                return "ok";
            } else {
                return "Incorrect password";
            }
        }
        return "Not Found";
    }
}
