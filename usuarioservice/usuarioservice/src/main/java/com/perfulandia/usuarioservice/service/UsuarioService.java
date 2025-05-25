package com.perfulandia.usuarioservice.service;

import com.perfulandia.usuarioservice.model.Usuario;
import com.perfulandia.usuarioservice.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UsuarioService {

    private final UsuarioRepository repo;
    //Constructor para inyectar el repositorio
    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    //Metodos CRUD

    //Eliminar
    public void Eliminar(Long id) {
        repo.deleteById(id);
    }

    //Método Buscar
    public Usuario buscar(Long id) {
        return repo.findById(id).orElse(null);
    }
    //Método Listar
    public List<Usuario> listar() {
        return repo.findAll();
    }

    //Metodo Guardar
    public Usuario guardar(Usuario usuario) {
        return repo.save(usuario);
    }




}
