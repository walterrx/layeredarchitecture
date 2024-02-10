import br.com.ecommerce.business.PedidoService;
import br.com.ecommerce.business.PedidoServiceImpl;
import br.com.ecommerce.business.ProdutoService;
import br.com.ecommerce.business.ProdutoServiceImpl;
import br.com.ecommerce.model.Produto;
import br.com.ecommerce.persistence.EmMemoriaPedidoRepository;
import br.com.ecommerce.persistence.EmMemoriaProdutoRepository;
import br.com.ecommerce.persistence.PedidoRepository;
import br.com.ecommerce.persistence.ProdutoRepository;
import br.com.ecommerce.presentation.PedidoController;
import br.com.ecommerce.presentation.ProdutoController;

public class Main {
    public static void main(String[] args) {

        ProdutoRepository produtoRepository = new EmMemoriaProdutoRepository();
        ProdutoService produtoService = new ProdutoServiceImpl(produtoRepository);

        PedidoRepository pedidoRepository = new EmMemoriaPedidoRepository();
        PedidoService pedidoService = new PedidoServiceImpl(pedidoRepository, produtoService);

        ProdutoController produtoController = new ProdutoController(produtoService);
        PedidoController pedidoController = new PedidoController(pedidoService);

        // Adiciona produtos ao repositório
        produtoRepository.gravar(new Produto(1L, "Produto 1", 10.0));
        produtoRepository.gravar(new Produto(2L, "Produto 2", 20.0));
        produtoRepository.gravar(new Produto(3L, "Produto 3", 30.0));

        // Simula interação do usuário
        produtoController.listarProdutos();
        pedidoController.criarPedido();

        // ...outras interações simuladas
    }
}