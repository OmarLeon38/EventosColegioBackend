package com.colegio.msregistroeventos.application.controllers.impl;
import com.colegio.msregistroeventos.application.controllers.EventoController;
import com.colegio.msregistroeventos.domain.entities.Evento;
import com.colegio.msregistroeventos.domain.services.impl.EventoSrviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventoControllerImpl implements EventoController {
    @Autowired
    EventoSrviceImpl eventoServiceImpl;

    @Override
    public List<Evento> Listar() {
        return eventoServiceImpl.Listar();
    }

    //@Override
    //public List<DetalleAlumnoEvento> ListarDetalleEventos() {
    //    return eventoServiceImpl.ListarDetalleCursos();
    //}

    @Override
    public Long Registrar(Evento evento) {
        return eventoServiceImpl.Registrar(evento);
    }

    @Override
    public boolean Actualizar(Evento evento) {
        return eventoServiceImpl.Actualizar(evento);
    }

    @Override
    public boolean Eliminar(Long id) {
        return eventoServiceImpl.Eliminar(id);
    }
}
