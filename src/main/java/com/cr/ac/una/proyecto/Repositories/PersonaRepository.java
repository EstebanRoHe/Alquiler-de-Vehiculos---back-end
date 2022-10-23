package com.cr.ac.una.proyecto.Repositories;

import com.cr.ac.una.proyecto.Models.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long> {
}
