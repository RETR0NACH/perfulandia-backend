package com.perfulandia.carritoservice.model;
import jakarta.persistence.*;

@Entity
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String usuarioId;
    private String productoId;
    private Integer cantidad;

    public Carrito() {}

    public Carrito(String usuarioId, String productoId, Integer cantidad) {
        this.usuarioId = usuarioId;
        this.productoId = productoId;
        this.cantidad = cantidad;
    }

    public Long getId() { return id; }
    public String getUsuarioId() { return usuarioId; }
    public String getProductoId() { return productoId; }
    public Integer getCantidad() { return cantidad; }

    public void setUsuarioId(String usuarioId) { this.usuarioId = usuarioId; }
    public void setProductoId(String productoId) { this.productoId = productoId; }
    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }
}

