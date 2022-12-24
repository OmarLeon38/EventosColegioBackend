package com.colegio.msregistroeventos.domain.repositories;

import com.colegio.msregistroeventos.domain.entities.Evento;

import java.util.List;
import java.util.Optional;

public interface EventoRepository {

    List<Evento> listarEventos();

    Optional<Evento> listarEventoxId(Long id);

    Long registrarEvento(Evento evento);

    boolean actualizarEvento(Evento evento);

    boolean eliminarEvento(Long id);
}
