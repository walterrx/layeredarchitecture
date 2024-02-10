package br.com.ecommerce.business;

import br.com.ecommerce.model.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {

    Optional<Produto> obterProdutoPeloId(Long id);
    List<Produto> obterTodosProdutos();
}
