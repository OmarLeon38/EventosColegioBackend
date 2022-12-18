package com.colegio.msregistroeventos.infraestructure.repositories;

import com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento;
import com.colegio.msregistroeventos.domain.entities.Alumno;
import com.colegio.msregistroeventos.domain.entities.Evento;
import jdk.jfr.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventoJpaRepository extends JpaRepository<Evento,Long> {
    //@Query(value = "select new com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento(e.id, e.nombreEvento, e.fechaInicio, e.fechaFin, a.dni, a.nombre, a.apellidos, a.correo) from Alumno a join Evento e on a.evento.id = e.id")
    //List<Alumno> ListarAlumnoEventos();
}

//select e.id, e.nombre_evento, e.fecha_inicio, e.fecha_fin, a.dni, a.nombre, a.apellidos, a.correo from alumnos a join eventos e on a.evento_id = e.id

//@Query(value = "select new com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento(e.id, e.nombreEvento, e.fechaInicio, e.fechaFin, a.dni, a.nombre, a.apellidos, a.correo) from Alumno a join Evento e on a.evento.id = e.id")