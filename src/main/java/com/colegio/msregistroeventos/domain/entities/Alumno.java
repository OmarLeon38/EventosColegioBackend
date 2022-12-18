package com.colegio.msregistroeventos.domain.entities;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Table(name ="alumnos")
@Entity
@Getter
@Setter
@ToString
public class Alumno {

    @Id
    String dni;

    @Nonnull
    String nombre;

    @Nonnull
    String apellidos;

    @Nonnull
    int edad;

    @Nonnull
    String correo;

    @Nonnull
    Date fechaInscripcion;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

}
