package com.example.ainda;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    /*@PostMapping
    @PutMapping
    @PatchMapping
    @DeleteMapping*/
    public String boasVindas() {
        return "Essa é a minha primeira mensagem!";
    }
}