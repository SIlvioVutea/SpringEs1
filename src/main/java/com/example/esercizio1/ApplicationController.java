package com.example.esercizio1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ApplicationController {
    @GetMapping(path = "/ciao")
    public String greets(@RequestParam(value = "nome", required = true) String name, @RequestParam(value = "provincia", required = true) String provincia) {
        return "Ciao " + name + ", com'è il tempo in " + provincia + " ?";
    }
}
