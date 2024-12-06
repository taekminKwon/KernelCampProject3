package com.example.exception.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/b")
public class RestApiBController {
    @GetMapping("/hello")
    public void hello(){
        throw new NumberFormatException("number format exception");
    }

    /*@ExceptionHandler(value = {NumberFormatException.class})
    public ResponseEntity numberFormatException(
            NumberFormatException e
    ){
        log.error("RestApiBController",e);
        return ResponseEntity.ok().build();
    }*/


}
