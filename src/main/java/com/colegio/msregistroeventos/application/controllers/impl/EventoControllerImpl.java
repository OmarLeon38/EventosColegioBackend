package com.colegio.msregistroeventos.application.controllers.impl;
import com.colegio.msregistroeventos.application.controllers.EventoController;
import com.colegio.msregistroeventos.domain.entities.Evento;
import com.colegio.msregistroeventos.domain.services.Impl.EventoSeviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EventoControllerImpl implements EventoController {
    @Autowired
    EventoSeviceImpl eventoServiceImpl;

    @Override
    public List<Evento> listarEventos() {
        return eventoServiceImpl.listarEventos();
    }

    @Override
    public Optional<Evento> listarEventoxId(Long id) {
        return eventoServiceImpl.listarEventoxId(id);
    }

    @Override
    public Long registrarEvento(Evento evento) {
        return eventoServiceImpl.registrarEvento(evento);
    }

    @Override
    public boolean actualizarEvento(Evento evento) {
        return eventoServiceImpl.actualizarEvento(evento);
    }

    @Override
    public boolean eliminarEvento(Long id) {
        return eventoServiceImpl.eliminarEvento(id);
    }
}
