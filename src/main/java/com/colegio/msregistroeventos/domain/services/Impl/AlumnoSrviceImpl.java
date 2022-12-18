package com.colegio.msregistroeventos.domain.services.impl;

import com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento;
import com.colegio.msregistroeventos.domain.entities.Alumno;
import com.colegio.msregistroeventos.domain.services.AlumnoService;
import com.colegio.msregistroeventos.infraestructure.repositories.impljpa.AlumnoJpaRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoSrviceImpl implements AlumnoService {
    @Autowired
    AlumnoJpaRepositoryImpl alumnoJpaRepository;

    @Override
    public List<Alumno> Listar() {
        return alumnoJpaRepository.Listar();
    }

    @Override
    public List<DetalleAlumnoEvento> ListarDetalleCursos() {
        return alumnoJpaRepository.ListarAlumnoEventos();
    }

    @Override
    public String Registrar(Alumno alumno) {
        return alumnoJpaRepository.Registrar(alumno);
    }

    @Override
    public boolean Actualizar(Alumno alumno) {
        return alumnoJpaRepository.Modificar(alumno);
    }

    @Override
    public boolean Eliminar(String dni) {
        return alumnoJpaRepository.Eliminar(dni);
    }
}
