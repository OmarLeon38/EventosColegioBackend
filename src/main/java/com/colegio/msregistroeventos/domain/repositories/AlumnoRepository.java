package com.colegio.msregistroeventos.domain.repositories;

import com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento;
import com.colegio.msregistroeventos.domain.entities.Alumno;

import java.util.List;

public interface AlumnoRepository {
    List<Alumno> listarAlumnos();

    List<DetalleAlumnoEvento> listarDetalleAlumnos();
    String registrarAlumno(Alumno alumno);

    boolean actualizarAlumno(Alumno alumno);

    boolean eliminarAlumno(String dni);
}
