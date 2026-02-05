package com.resatyavcin.palm.dto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class HealthResponse extends BaseResponse<String> {
    public HealthResponse(String data) {
        super(true, data, null);
    }
}
