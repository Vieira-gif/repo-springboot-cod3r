package br.com.exerciciossb.controllers;

import br.com.exerciciossb.model.entities.Produto;

import br.com.exerciciossb.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping(method = {RequestMethod.PUT, RequestMethod.POST})
    public @ResponseBody Produto novoProduto (@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Produto> obterProdutoPorId (@PathVariable int id) {
        return produtoRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void excluirProdutoPorId (@PathVariable int id) {
        produtoRepository.deleteById(id);
    }

}
