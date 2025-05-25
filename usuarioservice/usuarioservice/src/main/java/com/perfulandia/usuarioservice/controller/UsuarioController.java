package com.perfulandia.usuarioservice.controller;

import com.perfulandia.usuarioservice.model.Usuario;
import com.perfulandia.usuarioservice.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")

public class UsuarioController {

    private final UsuarioService service;
    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    //CRUD

    //listar
    @GetMapping
    public List<Usuario> listar() {
        return service.listar();
    }

    //Guardar
    @PostMapping
    public Usuario guardar(@RequestBody Usuario usuario) {
        return service.guardar(usuario);
    }

    //Buscar
    @GetMapping
    public Usuario buscar(@PathVariable long id) {
        return service.buscar(id);
    }

    //Eliminar
    public void Eliminar(@PathVariable long id) {
        service.Eliminar(id);
    }

}
