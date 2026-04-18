package com.example.commonapi.api;

import com.example.commonapi.dto.BookDTO;
import com.example.commonapi.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

    public interface IBookController {

        @RequestMapping(value = { "/bookstore"})
        ResponseEntity<ResponseDTO> hello();

        @PostMapping("/bookstore/insert")
        ResponseEntity<ResponseDTO> insertBook(
                @RequestHeader("Authorization") String token,
                @RequestBody BookDTO bookDTO
        );

        @GetMapping("/bookstore/get/all")
        ResponseEntity<ResponseDTO> getAllBooks();

        @GetMapping("/bookstore/get/asce")
        ResponseEntity<ResponseDTO> sortBooksAscending();

        @GetMapping("/bookstore/get/desc")
        ResponseEntity<ResponseDTO> sortBooksDescending();

        @GetMapping("/bookstore/get/{id}")
        ResponseEntity<ResponseDTO> getBookById(
                @RequestHeader("Authorization") String token,
                @PathVariable("id") long id
        );

        @GetMapping("/bookstore/get")
        ResponseEntity<ResponseDTO> searchBookByName(
                @RequestHeader("Authorization") String token,
                @RequestParam("bookName") String bookName
        );

        @DeleteMapping("/bookstore/delete/{id}")
        ResponseEntity<ResponseDTO> deleteBookById(
                @RequestHeader("Authorization") String token,
                @PathVariable("id") long id
        );

        @PutMapping("/bookstore/update/{id}")
        ResponseEntity<ResponseDTO> updateBookById(
                @RequestHeader("Authorization") String token,
                @PathVariable("id") long id,
                @RequestBody BookDTO bookDTO
        );

        @PutMapping("/bookstore/updatequantity")
        ResponseEntity<ResponseDTO> updateQuantity(
                @RequestHeader("Authorization") String token,
                @RequestParam("id") long id,
                @RequestParam("quantity") long quantity
        );
    }
