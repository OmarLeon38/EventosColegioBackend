package com.colegio.msregistroeventos.infraestructure.repositories;

import com.colegio.msregistroeventos.domain.entities.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoJpaRepository extends JpaRepository<Evento,Long> {
}
