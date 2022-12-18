package com.colegio.msregistroeventos.domain.services.impl;

import com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento;
import com.colegio.msregistroeventos.domain.entities.Evento;
import com.colegio.msregistroeventos.domain.services.EventoService;
import com.colegio.msregistroeventos.infraestructure.repositories.impljpa.EventoJpaRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoSrviceImpl implements EventoService {
    @Autowired
    EventoJpaRepositoryImpl eventoJpaRepository;

    @Override
    public List<Evento> Listar() {
        return eventoJpaRepository.Listar();
    }

    //@Override
    //public List<DetalleAlumnoEvento> ListarDetalleCursos() {
    //    return eventoJpaRepository.ListarAlumnoEventos();
    //}

    @Override
    public Long Registrar(Evento evento) {
        return eventoJpaRepository.Registrar(evento);
    }

    @Override
    public boolean Actualizar(Evento evento) {
        return eventoJpaRepository.Modificar(evento);
    }

    @Override
    public boolean Eliminar(Long id) {
        return eventoJpaRepository.Eliminar(id);
    }

}
