package com.example.userservice1.dto;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String firstName;
    private String lastName;
    @Email
    private String email;
    private String address;
    private LocalDate dob;
    private String password;
    private boolean isAdmin;
}
