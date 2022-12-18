package com.colegio.msregistroeventos.domain.repositories;

import com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento;
import com.colegio.msregistroeventos.domain.entities.Alumno;

import java.util.List;

public interface AlumnoRepository {
    List<Alumno> Listar();

    List<DetalleAlumnoEvento> ListarAlumnoEventos();
    String Registrar(Alumno alumno);

    boolean Modificar(Alumno alumno);

    boolean Eliminar(String dni);
}
