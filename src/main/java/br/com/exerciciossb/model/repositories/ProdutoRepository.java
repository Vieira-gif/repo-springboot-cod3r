package br.com.exerciciossb.model.repositories;

import br.com.exerciciossb.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
