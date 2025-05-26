package com.perfulandia.pedidoservice.model;

import jakarta.persistence.*;
import com.perfulandia.pedidoservice.Enum.EstadoPedido;


@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String usuarioId;
    private String productoId;
    private Integer cantidad;

    @Enumerated(EnumType.STRING)
    private EstadoPedido estado;

    public Pedido() {
        this.estado = EstadoPedido.GENERADO;
    }

    // Getters y Setters

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

}
