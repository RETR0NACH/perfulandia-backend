package com.perfulandia.carritoservice.controller;

import com.perfulandia.carritoservice.model.Carrito;
import com.perfulandia.carritoservice.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/carrito")
public class carritoController {
    @Autowired
    private CarritoService carritoService;

    @PostMapping("/agregar")
    public Carrito agregar(@RequestBody Carrito carrito) {
        return carritoService.agregarProducto(carrito);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        carritoService.eliminarProducto(id);
    }

    @GetMapping
    public List<Carrito> verCarrito() {
        return carritoService.obtenerCarrito();
    }
}

