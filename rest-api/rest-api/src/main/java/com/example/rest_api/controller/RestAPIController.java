package com.example.rest_api.controller;

import com.example.rest_api.model.BookQueryParam;
import com.example.rest_api.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class RestAPIController {
    @GetMapping(path = "/hello")
    public String hello(){
        var html = "<html> <body> <h1> Hello Spring Boot </h1> </body> </html>";
        return html;
    }

    @GetMapping(path = "/echo/{message}/age/{age}/is-man/{isMan}")
    public String echo(
            @PathVariable String message,
            @PathVariable int age,
            @PathVariable boolean isMan
    ){
        message = message.toUpperCase();
        System.out.println("message = " + message);
        System.out.println("age = " + age);
        System.out.println("isMan = " + isMan);
        return message;
    }
    @GetMapping(path = "/math/square/{number}")
    public int num(
            @PathVariable int number
    ){
        number = number * number;
        return number;
    }

    @GetMapping(path = "/tf/{TF}")
    public boolean bool(
            @PathVariable(name = "boolean") String trueFalse
    ){
        if(trueFalse.equals("T")){
            System.out.println("True");
            return true;
        } else
            System.out.println("False");
            return false;
    }

    @GetMapping(path = "/book")
    public void queryParam(
            @RequestParam String category,
            @RequestParam String issuedYear,
            @RequestParam(name = "issued-month") String issuedMonth,
            @RequestParam String issued_day
    ){
        System.out.println("category = " + category);
        System.out.println("issuedYear = " + issuedYear);
        System.out.println("issuedMonth = " + issuedMonth);
        System.out.println("issued_day = " + issued_day);
    }

    @GetMapping(path = "/book2")
    public void queryParamDTO(
            BookQueryParam bookQueryParam
    ){
        System.out.println(bookQueryParam);
    }

    @GetMapping(path ="/math/sum")
    public int returnSum(
            @RequestParam int a,
            @RequestParam int b
    ){
        System.out.println(a+b);
        return a + b;
    }

    @GetMapping(path ="/math/multiple")
    public int returnMultiple(
            @RequestParam int a,
            @RequestParam int b
    ){
        System.out.println(a*b);
        return a * b;
    }

    @DeleteMapping(path = {"/user/{username}/delete",
                            "/user/{username}/del"
          }
    )
    public void delete(
            @PathVariable String username
    ){
        log.info("삭제된 내용 : {}", username);
    }
}
