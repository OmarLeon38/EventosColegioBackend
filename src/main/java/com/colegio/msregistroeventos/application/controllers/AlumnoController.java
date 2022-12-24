package com.colegio.msregistroeventos.application.controllers;

import com.colegio.msregistroeventos.domain.dto.DetalleAlumno;
import com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento;
import com.colegio.msregistroeventos.domain.entities.Alumno;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(path = "/alumnos")
public interface AlumnoController {

    @GetMapping(value = "/listar", produces = "application/json")
    List<DetalleAlumno> listarAlumnos();

    @GetMapping(path = "/detalleAlumnos", produces = "application/json")
    List<DetalleAlumnoEvento> listarDetalleAlumnos();

    @GetMapping(value = "/listarxId/{dni}", produces = "application/json")
    Optional<Alumno> listarAlumnoxId(@PathVariable("dni") String dni);
    @PostMapping(value = "/registrar", consumes = {"application/json"})
    String registrarAlumno(@RequestBody Alumno alumno);

    @PutMapping(value = "/actualizar", consumes = {"application/json"})
    boolean actualizarAlumno(@RequestBody Alumno alumno);

    @DeleteMapping(value = "/eliminar/{dni}")
    boolean eliminarAlumno(@PathVariable("dni") String dni);
}

