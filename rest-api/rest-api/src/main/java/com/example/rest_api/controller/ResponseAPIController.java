package com.example.rest_api.controller;

import com.example.rest_api.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class ResponseAPIController {
    @GetMapping("")
    @RequestMapping(path = "")
    public ResponseEntity<UserRequest> user(){
        var user = new UserRequest();
        user.setName("홍길동");
        user.setEmail("hong@gmail.com");
        user.setUserAge(15);
        log.info("user :{}", user);

        var response = ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .header("x-custom","hi")
                .body(user);

        return response;
    }
}
