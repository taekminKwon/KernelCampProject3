package com.example.rest_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Data
@AllArgsConstructor
public class BookQueryParam {
    private String category;
    private String issuedYear;
    private String issuedMonth;
    private String issued_day;
}
