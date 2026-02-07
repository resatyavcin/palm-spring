package com.resatyavcin.palm.service.serviceImpl;

import com.resatyavcin.palm.dto.RegisterRequest;
import com.resatyavcin.palm.dto.RegisterResponse;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AuthServiceImpl implements com.resatyavcin.palm.service.AuthService {

    @Override
    public RegisterResponse register(RegisterRequest request) throws IllegalArgumentException {
        if(!Objects.equals(request.getPassword(), request.getConfirmPassword())){
            throw new IllegalArgumentException("Passwords do not match");
        }
        RegisterResponse response = new RegisterResponse();
        response.setMessage("Success");
        return response;
    }
}
