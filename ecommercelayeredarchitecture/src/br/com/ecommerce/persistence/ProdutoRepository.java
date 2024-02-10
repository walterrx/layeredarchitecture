package br.com.ecommerce.persistence;



import br.com.ecommerce.model.Produto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ProdutoRepository {

    Optional<Produto> findById(Long id);
    List<Produto> findAll();

    void gravar(Produto produto);

}
