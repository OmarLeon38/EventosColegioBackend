package com.colegio.msregistroeventos.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class DetalleAlumnoEvento {
    String dni;
    String nombre;
    String apellidos;
    String correo;
    Long id;
    String nombreEvento;
    Date fechaIncio;
    Date fechaFin;




}
