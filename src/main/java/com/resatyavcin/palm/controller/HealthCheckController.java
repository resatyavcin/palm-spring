package com.resatyavcin.palm.controller;

import com.resatyavcin.palm.dto.HealthResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/health")
public class HealthCheckController {

    @GetMapping
    public ResponseEntity<HealthResponse> healthCheck() {
        return ResponseEntity.ok(
                new HealthResponse("Server running...")
        );
    }
}
