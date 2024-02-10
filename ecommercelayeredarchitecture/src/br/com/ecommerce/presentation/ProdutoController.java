package br.com.ecommerce.presentation;

import br.com.ecommerce.business.ProdutoService;
import br.com.ecommerce.model.Produto;

import java.util.List;

public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService productService) {
        this.produtoService = productService;
    }

    public void listarProdutos() {
        List<Produto> produtos = produtoService.obterTodosProdutos();
        if (produtos != null) {
            produtos.forEach(produto -> System.out.println(produto));
        } else {
            System.out.println("Não há produtos para listar.");
        }
    }
}
