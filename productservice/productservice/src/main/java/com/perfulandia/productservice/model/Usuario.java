package com.perfulandia.productservice.model;

import lombok.*;
//DTO Data Transfer Object= objeto de transferencia de datos: para simular la respuesta de MS
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private long id;
    private String nombre,correo, rol;
}
