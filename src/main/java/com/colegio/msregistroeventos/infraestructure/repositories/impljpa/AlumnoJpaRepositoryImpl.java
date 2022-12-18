package com.colegio.msregistroeventos.infraestructure.repositories.impljpa;

import com.colegio.msregistroeventos.domain.dto.DetalleAlumno;
import com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento;
import com.colegio.msregistroeventos.domain.entities.Alumno;
import com.colegio.msregistroeventos.domain.repositories.AlumnoRepository;
import com.colegio.msregistroeventos.infraestructure.repositories.AlumnoJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AlumnoJpaRepositoryImpl implements AlumnoRepository {
    @Autowired
    AlumnoJpaRepository alumnoJpaRepository;

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
        return alumnoJpaRepository.save(alumno).getDni();
    }

    @Override
    public boolean actualizarAlumno(Alumno alumno) {
        alumnoJpaRepository.save(alumno);
        return true;
    }

    @Override
    public boolean eliminarAlumno(String dni) {
        alumnoJpaRepository.deleteById(dni);
        return true;
    }
}
