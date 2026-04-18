package com.example.commonapi.api;

import com.example.commonapi.dto.ResponseDTO;
import com.example.commonapi.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
public interface IUserController {

    @PostMapping("/bookstore/user/register")
    ResponseEntity<ResponseDTO> registerUser(@RequestBody UserDTO userDTO);

    @PostMapping("/bookstore/user/login")
    ResponseEntity<ResponseDTO> login(
            @RequestParam("email") String email,
            @RequestParam("password") String password
    );

    @PostMapping("/bookstore/user/changepassword")
    ResponseEntity<ResponseDTO> changePassword(
            @RequestParam("email") String email,
            @RequestParam("token") String token,
            @RequestParam("newPassword") String newPassword
    );

    @GetMapping("/bookstore/user/getall")
    ResponseEntity<ResponseDTO> getAllUsers();

    @GetMapping("/bookstore/user/get/{id}")
    ResponseEntity<ResponseDTO> getUserById(
            @PathVariable("id") Long id
    );

    @GetMapping("/bookstore/user/get")
    ResponseEntity<ResponseDTO> getUserByEmail(
            @RequestParam("email") String email
    );

    @PutMapping("/bookstore/user/update")
    ResponseEntity<ResponseDTO> updateUserByEmail(
            @RequestParam("email") String email,
            @RequestBody UserDTO userDTO
    );

    @DeleteMapping("/bookstore/user/delete/{id}")
    ResponseEntity<ResponseDTO> deleteUserById(
            @PathVariable("id") Long id
    );
}