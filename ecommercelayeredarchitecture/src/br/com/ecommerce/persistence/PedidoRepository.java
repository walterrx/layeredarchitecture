package br.com.ecommerce.persistence;

import br.com.ecommerce.model.Pedido;

import java.util.List;
import java.util.Optional;

public interface PedidoRepository {

    Optional<Pedido> findById(Long id);

    void save(Pedido pedido);

    List<Pedido> listAll();
}
