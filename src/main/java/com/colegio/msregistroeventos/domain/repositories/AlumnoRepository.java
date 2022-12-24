package com.colegio.msregistroeventos.domain.repositories;

import com.colegio.msregistroeventos.domain.dto.DetalleAlumno;
import com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento;
import com.colegio.msregistroeventos.domain.entities.Alumno;

import java.util.List;
import java.util.Optional;

public interface AlumnoRepository {
    List<DetalleAlumno> listarAlumnos();

    List<DetalleAlumnoEvento> listarDetalleAlumnos();

    Optional<Alumno> listarAlumnoxId(String dni);

    String registrarAlumno(Alumno alumno);

    boolean actualizarAlumno(Alumno alumno);

    boolean eliminarAlumno(String dni);
}
