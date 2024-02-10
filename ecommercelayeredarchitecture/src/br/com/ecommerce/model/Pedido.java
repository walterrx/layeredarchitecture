package br.com.ecommerce.model;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
    private Long id;
    private Map<Produto, Integer> produtos;


    public Pedido() {
        this.produtos = new HashMap<>(); // Inicialização da coleção de produtos
    }

    // outros getters e setters

    public Map<Produto, Integer> getProdutos() {
        return produtos;
    }

    public void setProdutos(Map<Produto, Integer> produtos) {
        this.produtos = produtos;
    }

    // Método que pode ser chamado para calcular o total de produtos
    public double calcularPrecoTotal() {
        return this.produtos.entrySet().stream()
                .mapToDouble(entry -> entry.getKey().getPreco() * entry.getValue())
                .sum();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
