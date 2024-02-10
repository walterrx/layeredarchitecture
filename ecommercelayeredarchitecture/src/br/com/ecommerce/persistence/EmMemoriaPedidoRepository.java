package br.com.ecommerce.persistence;

import br.com.ecommerce.model.Pedido;

import java.util.*;

public class EmMemoriaPedidoRepository implements PedidoRepository {

    private final Map<Long, Pedido> pedidos = new HashMap<>();
    private long nextId = 1; // Simulates auto-increment behavior in a real database

    @Override
    public Optional<Pedido> findById(Long id) {
        return Optional.ofNullable(pedidos.get(id));
    }

    @Override
    public List<Pedido> listAll(){
        return new ArrayList<>(pedidos.values());
    }

    @Override
    public void save(Pedido pedido) {
        if (pedido.getId() == null) {
            pedido.setId(nextId++);
        }
        pedidos.put(pedido.getId(), pedido); // Assumindo que pedidos é um Map<Long, Pedido>
    }

}
