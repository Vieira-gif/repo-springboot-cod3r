package br.com.exerciciossb.controllers;

import br.com.exerciciossb.models.Calculadora;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/soma")
    double soma(@RequestParam(name = "valor1") double valor1, @RequestParam(name = "valor2") double valor2) {
        Calculadora conta = new Calculadora();
        return conta.soma(valor1, valor2);
    };

    @GetMapping("/subtrai")
    double subtrai(@RequestParam(name = "valor1") double valor1, @RequestParam(name = "valor2") double valor2) {
        Calculadora conta = new Calculadora();
        return conta.subtrai(valor1, valor2);
    };
}
