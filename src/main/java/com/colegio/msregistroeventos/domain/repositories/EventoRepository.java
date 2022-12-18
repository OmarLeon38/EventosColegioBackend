package com.colegio.msregistroeventos.domain.repositories;

import com.colegio.msregistroeventos.domain.entities.Evento;

import java.util.List;

public interface EventoRepository {

    List<Evento> listarEventos();

    Long registrarEvento(Evento evento);

    boolean actualizarEvento(Evento evento);

    boolean eliminarEvento(Long id);
}
