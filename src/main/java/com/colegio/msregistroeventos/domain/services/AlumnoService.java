package com.colegio.msregistroeventos.domain.services;

import com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento;
import com.colegio.msregistroeventos.domain.entities.Alumno;

import java.util.List;

public interface AlumnoService {
    List<Alumno> listarAlumnos();

    List<DetalleAlumnoEvento> listarDetalleAlumnos();
    String registrarAlumno(Alumno alumno);

    boolean actualizarAlumno(Alumno alumno);

    boolean eliminarAlumno(String dni);
}
