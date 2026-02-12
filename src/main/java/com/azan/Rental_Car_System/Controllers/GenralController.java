package com.azan.Rental_Car_System.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenralController {
    @GetMapping("/test")
    String test(){
        return "Server is working";
    }
}
