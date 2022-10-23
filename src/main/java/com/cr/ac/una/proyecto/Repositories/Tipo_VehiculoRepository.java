package com.cr.ac.una.proyecto.Repositories;

import com.cr.ac.una.proyecto.Models.Tipo_Vehiculo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Tipo_VehiculoRepository extends CrudRepository<Tipo_Vehiculo,Long> {
}
