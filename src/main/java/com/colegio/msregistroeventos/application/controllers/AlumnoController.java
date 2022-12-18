package com.colegio.msregistroeventos.application.controllers;

import com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento;
import com.colegio.msregistroeventos.domain.entities.Alumno;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequestMapping(path = "/alumno")
public interface AlumnoController {

    @GetMapping(value = "/alumnos", produces = "application/json")
    List<Alumno> Listar();

    @GetMapping(path = "/alumnos/eventos", produces = "application/json")
    List<DetalleAlumnoEvento> ListarDetalleEventos();
    @PostMapping(value = "/alumnos", consumes = {"application/json"})
    String Registrar(@RequestBody Alumno alumno);

    @PutMapping(value = "/alumnos", consumes = {"application/json"})
    boolean Actualizar(@RequestBody Alumno alumno);

    @DeleteMapping(value = "/alumnos/{dni}")
    boolean Eliminar(@PathVariable("dni") String dni);
}

