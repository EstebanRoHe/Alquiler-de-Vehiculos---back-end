package com.cr.ac.una.proyecto.Repositories;

import com.cr.ac.una.proyecto.Models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {
}
