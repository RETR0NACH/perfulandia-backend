package com.perfulandia.pedidoservice.service;

import com.perfulandia.pedidoservice.model.Pedido;
import com.perfulandia.pedidoservice.Enum.EstadoPedido;
import com.perfulandia.pedidoservice.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido crearPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> obtenerPedidos() {
        return pedidoRepository.findAll();
    }

    public Pedido actualizarEstado(Long id, EstadoPedido estado) {
        Pedido pedido = pedidoRepository.findById(id).orElseThrow();
        pedido.setEstado(estado);
        return pedidoRepository.save(pedido);
    }
}

