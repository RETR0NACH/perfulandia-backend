package com.perfulandia.carritoservice.service;

import com.perfulandia.carritoservice.model.Carrito;
import com.perfulandia.carritoservice.repository.CarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CarritoService {
    @Autowired
    private CarritoRepository carritoRepository;

    public Carrito agregarProducto(Carrito carrito) {
        return carritoRepository.save(carrito);
    }

    public void eliminarProducto(Long id) {
        carritoRepository.deleteById(id);
    }

    public List<Carrito> obtenerCarrito() {
        return carritoRepository.findAll();
    }
}

