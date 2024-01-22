package com.apiinterface.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {

    private String message;
    private String status;
    private Object data;
}