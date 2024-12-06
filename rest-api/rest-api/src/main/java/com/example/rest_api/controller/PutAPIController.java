package com.example.rest_api.controller;

import com.example.rest_api.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
@Slf4j
public class PutAPIController {
    @PutMapping("/put-user")
    public UserRequest put(@RequestBody UserRequest userRequest){
        log.info("Request : {}", userRequest);
        return userRequest;
    }
}
