package br.com.ecommerce.persistence;


import br.com.ecommerce.model.Produto;

import java.util.*;

public class EmMemoriaProdutoRepository implements ProdutoRepository {

    private Map<Long, Produto> produtos = new HashMap<>();
    private long nextId = 1; // Simulates auto-increment behavior in a real database

    @Override
    public Optional<Produto> findById(Long id) {
        return Optional.ofNullable(produtos.get(id));
    }

    @Override
    public List<Produto> findAll() {
        return new ArrayList<>(produtos.values());
    }

    @Override
    public void gravar(Produto produto) {
        if (produto.getId() == null) {
            produto.setId(nextId++);
        }
        produtos.put(produto.getId(), produto);
    }


}
