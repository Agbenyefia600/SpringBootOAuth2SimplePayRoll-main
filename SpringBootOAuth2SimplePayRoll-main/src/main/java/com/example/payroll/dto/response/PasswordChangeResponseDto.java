package com.example.payroll.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PasswordChangeResponseDto {

    private boolean result;

    private String message;
}