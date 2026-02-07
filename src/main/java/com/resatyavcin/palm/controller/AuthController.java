package com.resatyavcin.palm.controller;

import com.resatyavcin.palm.dto.RegisterRequest;
import com.resatyavcin.palm.dto.RegisterResponse;
import com.resatyavcin.palm.service.serviceImpl.AuthServiceImpl;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthServiceImpl authServiceImpl;

    public AuthController(AuthServiceImpl authServiceImpl) {
        this.authServiceImpl = authServiceImpl;
    }

    @PostMapping("/register")
    ResponseEntity<RegisterResponse> register(@Valid @RequestBody RegisterRequest request) throws Exception {
        return ResponseEntity.ok(authServiceImpl.register(request));
    }
}
