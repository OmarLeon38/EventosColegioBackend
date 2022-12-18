package com.colegio.msregistroeventos.domain.services.Impl;

import com.colegio.msregistroeventos.domain.dto.DetalleAlumno;
import com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento;
import com.colegio.msregistroeventos.domain.entities.Alumno;
import com.colegio.msregistroeventos.domain.services.AlumnoService;
import com.colegio.msregistroeventos.infraestructure.repositories.impljpa.AlumnoJpaRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {
    @Autowired
    AlumnoJpaRepositoryImpl alumnoJpaRepository;

    @Override
    public List<DetalleAlumno> listarAlumnos() {
        return alumnoJpaRepository.listarAlumnos();
    }

    @Override
    public List<DetalleAlumnoEvento> listarDetalleAlumnos() {
        return alumnoJpaRepository.listarDetalleAlumnos();
    }

    @Override
    public String registrarAlumno(Alumno alumno) {
        return alumnoJpaRepository.registrarAlumno(alumno);
    }

    @Override
    public boolean actualizarAlumno(Alumno alumno) {
        return alumnoJpaRepository.actualizarAlumno(alumno);
    }

    @Override
    public boolean eliminarAlumno(String dni) {
        return alumnoJpaRepository.eliminarAlumno(dni);
    }
}
