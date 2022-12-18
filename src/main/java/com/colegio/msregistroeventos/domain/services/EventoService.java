package com.colegio.msregistroeventos.domain.services;

import com.colegio.msregistroeventos.domain.entities.Evento;

import java.util.List;

public interface EventoService {
    List<Evento> listarEventos();

    Long registrarEvento(Evento evento);

    boolean actualizarEvento(Evento evento);

    boolean eliminarEvento(Long id);
}
