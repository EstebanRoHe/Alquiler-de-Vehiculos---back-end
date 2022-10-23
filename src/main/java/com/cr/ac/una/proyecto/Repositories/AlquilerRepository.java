package com.cr.ac.una.proyecto.Repositories;

import com.cr.ac.una.proyecto.Models.Alquiler;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlquilerRepository extends CrudRepository<Alquiler,Long> {
}
