package com.colegio.msregistroeventos.application.controllers;
import com.colegio.msregistroeventos.domain.entities.Evento;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(path = "/eventos")
public interface EventoController {

    @GetMapping(value = "/listar", produces = "application/json")
    List<Evento> listarEventos();

    @GetMapping(value = "/listarxId/{id}", produces = "application/json")
    Optional<Evento> listarEventoxId(@PathVariable("id") Long id);

    @PostMapping(value = "/registrar", consumes = {"application/json"})
    Long registrarEvento(@RequestBody Evento evento);

    @PutMapping(value = "/actualizar", consumes ={"application/json"})
    boolean actualizarEvento(@RequestBody Evento evento);

    @DeleteMapping(value = "/eliminar/{id}")
    boolean eliminarEvento(@PathVariable("id") Long id);
}
