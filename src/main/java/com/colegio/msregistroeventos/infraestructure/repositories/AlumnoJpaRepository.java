package com.colegio.msregistroeventos.infraestructure.repositories;

import com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento;
import com.colegio.msregistroeventos.domain.entities.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoJpaRepository extends JpaRepository<Alumno,String> {
        @Query(value = "select new com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento(a.dni, a.nombre, a.apellidos, a.correo, e.id, e.nombreEvento, e.fechaInicio, e.fechaFin) from Alumno a join Evento e on a.evento.id = e.id")
        List<DetalleAlumnoEvento> listarDetalleAlumnos();
}
