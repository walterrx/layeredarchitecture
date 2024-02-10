package br.com.ecommerce.business;

import br.com.ecommerce.model.Pedido;

public interface PedidoService {

    Pedido criarPedido();
    Pedido adicionarProdutoNoPedido (Long idPedido, Long idProduto, int quantidade);

    void finalizarPedido(Long idPedido);

}
