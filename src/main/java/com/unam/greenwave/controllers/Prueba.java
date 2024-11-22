package com.unam.greenwave.controllers; 

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Prueba {
    @GetMapping("/")
    public String prueba() {
        return "Hola mundo";
    }
    

}
