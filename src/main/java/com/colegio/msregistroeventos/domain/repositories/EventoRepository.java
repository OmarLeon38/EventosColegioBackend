package com.colegio.msregistroeventos.domain.repositories;

import com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento;
import com.colegio.msregistroeventos.domain.entities.Evento;

import java.util.List;

public interface EventoRepository {

    List<Evento> Listar();

    //List<DetalleAlumnoEvento> ListarAlumnoEventos();

    Long Registrar(Evento evento);

    boolean Modificar(Evento evento);

    boolean Eliminar(Long id);
}
