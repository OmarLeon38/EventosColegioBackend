package com.colegio.msregistroeventos.domain.services.Impl;

import com.colegio.msregistroeventos.domain.entities.Evento;
import com.colegio.msregistroeventos.domain.services.EventoService;
import com.colegio.msregistroeventos.infraestructure.repositories.impljpa.EventoJpaRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoSeviceImpl implements EventoService {
    @Autowired
    EventoJpaRepositoryImpl eventoJpaRepository;

    @Override
    public List<Evento> listarEventos() {
        return eventoJpaRepository.listarEventos();
    }

    @Override
    public Long registrarEvento(Evento evento) {
        return eventoJpaRepository.registrarEvento(evento);
    }

    @Override
    public boolean actualizarEvento(Evento evento) {
        return eventoJpaRepository.actualizarEvento(evento);
    }

    @Override
    public boolean eliminarEvento(Long id) {
        return eventoJpaRepository.eliminarEvento(id);
    }

}
