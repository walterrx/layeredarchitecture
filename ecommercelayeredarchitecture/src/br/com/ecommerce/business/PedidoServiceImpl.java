package br.com.ecommerce.business;

import br.com.ecommerce.model.Pedido;
import br.com.ecommerce.model.Produto;
import br.com.ecommerce.persistence.PedidoRepository;

public class PedidoServiceImpl implements PedidoService {

    private final PedidoRepository pedidoRepository;
    private final ProdutoService produtoService;

    public PedidoServiceImpl(PedidoRepository pedidoRepository, ProdutoService produtoService){
        this.pedidoRepository = pedidoRepository;
        this.produtoService = produtoService;
    }

    @Override
    public Pedido criarPedido() {
        Pedido novoPedido = new Pedido(); // Cria um novo pedido com um mapa de produtos inicializado
        // Configura o pedido conforme necessário
        pedidoRepository.save(novoPedido); // Salva o novo pedido no repositório
        return novoPedido;
    }

    @Override
    public Pedido adicionarProdutoNoPedido(Long idPedido, Long idProduto, int quantidade) {
        Pedido pedido = pedidoRepository.findById(idPedido)
                .orElseThrow(() -> new IllegalArgumentException("Pedido não encontrado"));
        Produto produto = produtoService.obterProdutoPeloId(idProduto)
                .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado"));

        // Lógica para adicionar o produto ao pedido com a quantidade especificada
        // ...

        pedidoRepository.save(pedido); // Salva as alterações no pedido
        return pedido;
    }

    @Override
    public void finalizarPedido(Long idPedido) {
        Pedido pedido = pedidoRepository.findById(idPedido)
                .orElseThrow(() -> new IllegalArgumentException("Pedido não encontrado"));

        // Lógica para finalizar o pedido
        // ...

        pedidoRepository.save(pedido); // Salva as alterações no pedido
    }
}

