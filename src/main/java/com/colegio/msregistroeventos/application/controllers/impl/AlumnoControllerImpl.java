package com.colegio.msregistroeventos.application.controllers.impl;

import com.colegio.msregistroeventos.application.controllers.AlumnoController;
import com.colegio.msregistroeventos.domain.dto.DetalleAlumnoEvento;
import com.colegio.msregistroeventos.domain.entities.Alumno;
import com.colegio.msregistroeventos.domain.services.impl.AlumnoSrviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlumnoControllerImpl implements AlumnoController {
    @Autowired
    AlumnoSrviceImpl alumnoServcieImpl;

    @Override
    public List<Alumno> Listar() {
       return alumnoServcieImpl.Listar();
    }

    @Override
    public List<DetalleAlumnoEvento> ListarDetalleEventos() {
        return alumnoServcieImpl.ListarDetalleCursos();
    }

    @Override
    public String Registrar(Alumno alumno) {
        return alumnoServcieImpl.Registrar(alumno);
    }

    @Override
    public boolean Actualizar(Alumno alumno) {
        return alumnoServcieImpl.Actualizar(alumno);
    }

    @Override
    public boolean Eliminar(String dni) {
        return alumnoServcieImpl.Eliminar(dni);
    }
}
