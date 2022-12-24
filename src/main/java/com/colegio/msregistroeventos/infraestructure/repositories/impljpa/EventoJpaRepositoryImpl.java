package com.colegio.msregistroeventos.infraestructure.repositories.impljpa;

import com.colegio.msregistroeventos.domain.entities.Evento;
import com.colegio.msregistroeventos.domain.repositories.EventoRepository;
import com.colegio.msregistroeventos.infraestructure.repositories.EventoJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
public class EventoJpaRepositoryImpl implements EventoRepository {
    @Autowired
    EventoJpaRepository eventoJpaRepository;

    @Override
    public List<Evento> listarEventos() {
        return eventoJpaRepository.findAll();
    }

    @Override
    public Optional<Evento> listarEventoxId(Long id) {
        return eventoJpaRepository.findById(id);
    }

    @Override
    public Long registrarEvento(Evento evento) {
        return eventoJpaRepository.save(evento).getId();
    }

    @Override
    public boolean actualizarEvento(Evento evento) {
        eventoJpaRepository.save(evento);
        return true;
    }

    @Override
    public boolean eliminarEvento(Long id) {
        eventoJpaRepository.deleteById(id);
        return true;
    }
}
