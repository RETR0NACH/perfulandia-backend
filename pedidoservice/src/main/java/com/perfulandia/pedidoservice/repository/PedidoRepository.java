package com.perfulandia.pedidoservice.repository;

import com.perfulandia.pedidoservice.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}

