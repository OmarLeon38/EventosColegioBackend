package com.colegio.msregistroeventos.application.controllers.impl;

import com.colegio.msregistroeventos.application.controllers.AlumnoController;
import com.colegio.msregistroeventos.domain.dto.DetalleAlumno;
import com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento;
import com.colegio.msregistroeventos.domain.entities.Alumno;
import com.colegio.msregistroeventos.domain.services.Impl.AlumnoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlumnoControllerImpl implements AlumnoController {
    @Autowired
    AlumnoServiceImpl alumnoServcieImpl;

    @Override
    public List<DetalleAlumno> listarAlumnos() {
       return alumnoServcieImpl.listarAlumnos();
    }

    @Override
    public List<DetalleAlumnoEvento> listarDetalleAlumnos() {
        return alumnoServcieImpl.listarDetalleAlumnos();
    }

    @Override
    public String registrarAlumno(Alumno alumno) {
        return alumnoServcieImpl.registrarAlumno(alumno);
    }

    @Override
    public boolean actualizarAlumno(Alumno alumno) {
        return alumnoServcieImpl.actualizarAlumno(alumno);
    }

    @Override
    public boolean eliminarAlumno(String dni) {
        return alumnoServcieImpl.eliminarAlumno(dni);
    }
}
