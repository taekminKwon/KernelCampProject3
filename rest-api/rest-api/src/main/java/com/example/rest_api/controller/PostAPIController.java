package com.example.rest_api.controller;

import com.example.rest_api.model.BookRequest;
import com.example.rest_api.model.UserRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostAPIController {
    @PostMapping("/post-book")
    public String postBook(
            @RequestBody BookRequest bookRequest
    ){
        System.out.println(bookRequest);
        return bookRequest.toString();
    }

    @PostMapping("/post-member")
    public UserRequest postMember(
            @RequestBody UserRequest userRequest
            ){
        System.out.println(userRequest);
        return userRequest;
    }

}
