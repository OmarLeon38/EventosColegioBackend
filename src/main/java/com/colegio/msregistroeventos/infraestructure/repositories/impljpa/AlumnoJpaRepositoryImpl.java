package com.colegio.msregistroeventos.infraestructure.repositories.impljpa;

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
    public List<Alumno> Listar() {
        return alumnoJpaRepository.findAll();
    }

    @Override
    public List<DetalleAlumnoEvento> ListarAlumnoEventos() {
        return alumnoJpaRepository.ListarAlumnoEventos();
    }

    @Override
    public String Registrar(Alumno alumno) {
        return alumnoJpaRepository.save(alumno).getDni();
    }

    @Override
    public boolean Modificar(Alumno alumno) {
        alumnoJpaRepository.save(alumno);
        return true;
    }

    @Override
    public boolean Eliminar(String dni) {
        alumnoJpaRepository.deleteById(dni);
        return true;
    }
}
