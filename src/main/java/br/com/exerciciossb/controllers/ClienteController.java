package br.com.exerciciossb.controllers;

import br.com.exerciciossb.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes" )
public class ClienteController {

    @GetMapping("/qualquer")
    Cliente obterCliente() {
        return new Cliente("JTS", 22, "123.456.789.-00");
    }

    @GetMapping("/{id}")
    Cliente obterClientePorId(@PathVariable int id) {
        return new Cliente("JTS 2", id, "123.456.789.-00");
    }

    @GetMapping
    Cliente obterClientePorNomeQuery(
            @RequestParam(name = "id", defaultValue = "2") int id) {
        return new Cliente("JTS 3", id, "123.456.789.-00");
    }
}