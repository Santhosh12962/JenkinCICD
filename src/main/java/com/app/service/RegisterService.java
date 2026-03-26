package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Register;
import com.app.repository.RegisterRepository;

@Service
public class RegisterService {
    
    @Autowired
    private RegisterRepository registerRepository;

    public String addRegister(Register data) {
        // Check if username already exists
        Register existingUser = registerRepository.findByUserName(data.getUserName());

        if (existingUser != null) {
            
            return "already";
        } else {
   
            Register newUser = new Register();
            newUser.setUserId(data.getUserId());
            newUser.setUserName(data.getUserName());
            newUser.setPassword(data.getPassword());
            newUser.setEmail(data.getEmail());

            registerRepository.save(newUser);
            return "ok";
        }
    }
}
