package com.resatyavcin.palm.service;

import com.resatyavcin.palm.dto.RegisterRequest;
import com.resatyavcin.palm.dto.RegisterResponse;

public interface AuthService {
    RegisterResponse register(RegisterRequest request) throws Exception;
}
