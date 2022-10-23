package com.cr.ac.una.proyecto.Repositories;

import com.cr.ac.una.proyecto.Models.Vehiculo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends CrudRepository<Vehiculo,Long> {
}
