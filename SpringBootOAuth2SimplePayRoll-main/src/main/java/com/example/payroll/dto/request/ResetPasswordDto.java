package com.example.payroll.dto.request;

import lombok.Data;

@Data
public class ResetPasswordDto {
    private String useremail;
    private String newpassword;
    private String token;
}
