package com.colegio.msregistroeventos.infraestructure.repositories.impljpa;

import com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento;
import com.colegio.msregistroeventos.domain.entities.Alumno;
import com.colegio.msregistroeventos.domain.entities.Evento;
import com.colegio.msregistroeventos.domain.repositories.EventoRepository;
import com.colegio.msregistroeventos.infraestructure.repositories.EventoJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EventoJpaRepositoryImpl implements EventoRepository {
    @Autowired
    EventoJpaRepository eventoJpaRepository;

    @Override
    public List<Evento> Listar() {
        return eventoJpaRepository.findAll();
    }

    //@Override
    //public List<DetalleAlumnoEvento> ListarAlumnoEventos() {
    //    return eventoJpaRepository.ListarAlumnoEventos();
    //}

    @Override
    public Long Registrar(Evento evento) {
        return eventoJpaRepository.save(evento).getId();
    }

    @Override
    public boolean Modificar(Evento evento) {
        eventoJpaRepository.save(evento);
        return true;
    }

    @Override
    public boolean Eliminar(Long id) {
        eventoJpaRepository.deleteById(id);
        return true;
    }
}
