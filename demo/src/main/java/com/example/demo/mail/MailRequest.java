package com.example.demo.mail;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MailRequest {
    private String email;
    private String code;
}
