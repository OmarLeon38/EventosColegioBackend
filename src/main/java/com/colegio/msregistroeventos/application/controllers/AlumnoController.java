package com.colegio.msregistroeventos.application.controllers;

import com.colegio.msregistroeventos.domain.dto.DetalleAlumno;
import com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento;
import com.colegio.msregistroeventos.domain.entities.Alumno;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/alumnos")
public interface AlumnoController {

    @GetMapping(value = "/listar", produces = "application/json")
    List<DetalleAlumno> listarAlumnos();

    @GetMapping(path = "/detalleAlumnos", produces = "application/json")
    List<DetalleAlumnoEvento> listarDetalleAlumnos();
    @PostMapping(value = "/registrar", consumes = {"application/json"})
    String registrarAlumno(@RequestBody Alumno alumno);

    @PutMapping(value = "/actualizar", consumes = {"application/json"})
    boolean actualizarAlumno(@RequestBody Alumno alumno);

    @DeleteMapping(value = "/eliminar/{dni}")
    boolean eliminarAlumno(@PathVariable("dni") String dni);
}

