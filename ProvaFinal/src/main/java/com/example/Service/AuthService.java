package com.example.Service;

import org.springframework.stereotype.Service;
import com.example.Security.JwtUtil;

@Service
public class AuthService {

    public String generateToken(String userName){
        String token = JwtUtil.generatedToken(userName);
        return token;
    }

    public String extractUsername(String token){
        String userName = JwtUtil.extractUsername(token);
        return userName;
    }

}
