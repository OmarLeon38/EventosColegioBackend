package com.colegio.msregistroeventos.domain.services;

import com.colegio.msregistroeventos.domain.entities.Evento;

import java.util.List;
import java.util.Optional;

public interface EventoService {
    List<Evento> listarEventos();

    Optional<Evento> listarEventoxId(Long id);

    Long registrarEvento(Evento evento);

    boolean actualizarEvento(Evento evento);

    boolean eliminarEvento(Long id);
}
