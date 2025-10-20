package br.com.exerciciossb.controllers;

import br.com.exerciciossb.model.entities.Produto;

import br.com.exerciciossb.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

    @GetMapping("/pagina/{numeroPagina}/{qtdPagina}")
    public @ResponseBody Iterable<Produto> listarProdutosPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdPagina) {
        if (qtdPagina >= 50 || qtdPagina <= 0) qtdPagina = 10;
        Pageable page = PageRequest.of(numeroPagina, qtdPagina);
        return produtoRepository.findAll(page);
    }

    @GetMapping
    public Iterable<Produto> obterProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/nome/{nome}")
    public Iterable<Produto> obterProdutoPorNome(@PathVariable String nome) {
        return produtoRepository.findByNomeContainingIgnoreCase(nome);
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
