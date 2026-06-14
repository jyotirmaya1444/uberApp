package com.uber.uberApp.services.impl;

import com.uber.uberApp.dto.SignUpDTO;
import com.uber.uberApp.dto.UserDTO;
import com.uber.uberApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDTO signUP(SignUpDTO signUpDTO) {
        return null;
    }
}
