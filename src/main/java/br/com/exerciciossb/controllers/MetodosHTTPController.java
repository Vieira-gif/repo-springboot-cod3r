package br.com.exerciciossb.controllers;

import jakarta.annotation.security.PermitAll;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodos")
public class MetodosHTTPController {

    @GetMapping
    String get() {
        return "Requisição GET";
    }

    @PostMapping
    String post() {
        return "Requisição POST";
    }

    @PutMapping
    String put() {
        return "Requisição PUT";
    }

    @PatchMapping
    String patch() {
        return "Requisição PATCH";
    }

    @DeleteMapping
    String delete() {
        return "Requisição DELETE";
    }

}
