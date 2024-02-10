package br.com.ecommerce.business;

import br.com.ecommerce.model.Produto;
import br.com.ecommerce.persistence.ProdutoRepository;

import java.util.List;
import java.util.Optional;

public class ProdutoServiceImpl implements ProdutoService{

    private final ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    @Override
    public Optional<Produto> obterProdutoPeloId(Long id) {
        return produtoRepository.findById(id); // Retorna o Optional diretamente do repositório
    }

    @Override
    public List<Produto> obterTodosProdutos() {
        return produtoRepository.findAll(); // Retorna a lista de produtos
    }
}
