package com.colegio.msregistroeventos.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class DetalleAlumno {
    String dni;
    String nombre;
    String apellidos;
    int edad;
    String correo;
}
