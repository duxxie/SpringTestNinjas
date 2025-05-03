package com.example.ainda.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/ninjas")
    /*@PostMapping
    @PutMapping
    @PatchMapping
    @DeleteMapping*/
    public String ninjas() {
        return "Essa é o controlador de Ninjas!";
    }
}