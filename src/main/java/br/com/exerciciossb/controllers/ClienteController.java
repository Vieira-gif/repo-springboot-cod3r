package br.com.exerciciossb.controllers;

import br.com.exerciciossb.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes" )
public class ClienteController {

    @GetMapping("/qualquer")
    Cliente obterCliente() {
        return new Cliente("JTS", 22, "123.456.789.-00");
    }
}
