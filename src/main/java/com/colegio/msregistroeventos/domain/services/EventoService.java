package com.colegio.msregistroeventos.domain.services;

import com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento;
import com.colegio.msregistroeventos.domain.entities.Evento;

import java.util.List;

public interface EventoService {
    List<Evento> Listar();

    //List<DetalleAlumnoEvento> ListarDetalleCursos();

    Long Registrar(Evento evento);

    boolean Actualizar(Evento evento);

    boolean Eliminar(Long id);
}
