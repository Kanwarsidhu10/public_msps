package com.kanwarsidhu.spring_security_jwt.controller;


import com.kanwarsidhu.spring_security_jwt.repository.UserRepository;
import com.kanwarsidhu.spring_security_jwt.security.JwtUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthenticationController {

    private AuthenticationManager authenticationManager;
    private UserRepository userRepository;
    private PasswordEncoder encoder;

    private JwtUtility jwtUtils;

    @Autowired
    public AuthenticationController(AuthenticationManager authenticationManager, UserRepository userRepository, PasswordEncoder encoder, JwtUtility jwtUtils) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.encoder = encoder;
        this.jwtUtils = jwtUtils;
    }


}
