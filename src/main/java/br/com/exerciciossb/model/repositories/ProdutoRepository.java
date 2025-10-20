package br.com.exerciciossb.model.repositories;

import br.com.exerciciossb.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>, CrudRepository<Produto, Integer> {
    public Iterable<Produto> findByNomeContainingIgnoreCase(String nome);
}
