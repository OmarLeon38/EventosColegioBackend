package com.colegio.msregistroeventos.application.controllers;

import com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento;
import com.colegio.msregistroeventos.domain.entities.Evento;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequestMapping(path = "/evento")
public interface EventoController {

    @GetMapping(value = "/eventos", produces = "application/json")
    List<Evento> Listar();

    //@GetMapping(path = "/detalle", produces = "application/json")
    //List<DetalleAlumnoEvento> ListarDetalleEventos();

    @PostMapping(value = "/eventos", consumes = {"application/json"})
    Long Registrar(@RequestBody Evento evento);

    @PutMapping(value = "/eventos", consumes ={"application/json"})
    boolean Actualizar(@RequestBody Evento evento);

    @DeleteMapping(value = "/eventos/{id}")
    boolean Eliminar(@PathVariable("id") Long id);
}
