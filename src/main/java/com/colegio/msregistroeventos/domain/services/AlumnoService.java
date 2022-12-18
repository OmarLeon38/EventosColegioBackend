package com.colegio.msregistroeventos.domain.services;

import com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento;
import com.colegio.msregistroeventos.domain.entities.Alumno;

import java.util.List;

public interface AlumnoService {
    List<Alumno> Listar();

    List<DetalleAlumnoEvento> ListarDetalleCursos();
    String Registrar(Alumno alumno);

    boolean Actualizar(Alumno alumno);

    boolean Eliminar(String dni);
}
