package com.perfulandia.usuarioservice.repository;

import com.perfulandia.usuarioservice.model.Usuario;
// IMPORTAR JPA REPOSITORY PARA TRABAJAR CON CRUD
import org.springframework.data.jpa.repository.JpaRepository;

// INTERFAZ HEREDA DE JPA Y GESIONA LA ENTIDAD USUARIO CON ID LONG
//findAll()
//findById(id)
//save()
//delete
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {



}
