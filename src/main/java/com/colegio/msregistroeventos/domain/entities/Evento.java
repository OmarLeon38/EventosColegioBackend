package com.colegio.msregistroeventos.domain.entities;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Table(name = "eventos")
@Entity
@Getter
@Setter
@ToString
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Nonnull
    String nombreEvento;

    @Nonnull
    Date fechaInicio;

    @Nonnull
    Date fechaFin;
}
