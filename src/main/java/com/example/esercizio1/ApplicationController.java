package com.example.esercizio1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ApplicationController {
    @GetMapping(path = "/greets")
    public String greets(@RequestParam(value = "name", required = true) String name) {
        return name;
    }
}
