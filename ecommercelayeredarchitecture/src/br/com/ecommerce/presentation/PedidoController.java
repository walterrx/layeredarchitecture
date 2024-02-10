package br.com.ecommerce.presentation;

import br.com.ecommerce.business.PedidoService;
import br.com.ecommerce.model.Pedido;

public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService){
        this.pedidoService = pedidoService;

    }

    public Pedido criarPedido(){
        // Chama o método criarPedido do PedidoService que deve criar e retornar uma nova instância de Pedido
        Pedido pedido = pedidoService.criarPedido();
        return pedido;
    }
}
