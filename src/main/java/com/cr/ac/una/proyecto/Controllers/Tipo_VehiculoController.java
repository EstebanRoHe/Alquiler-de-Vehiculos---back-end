package com.cr.ac.una.proyecto.Controllers;

import com.cr.ac.una.proyecto.Models.Tipo_Vehiculo;
import com.cr.ac.una.proyecto.Repositories.Tipo_VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/Tipo_Vehiculo")
public class Tipo_VehiculoController {

    @Autowired
    public Tipo_VehiculoRepository tipo_vehiculoRepository;

    @GetMapping
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<List<Tipo_Vehiculo>> findAll(){
        List<Tipo_Vehiculo> list = new ArrayList<Tipo_Vehiculo>();
        tipo_vehiculoRepository.findAll().forEach(e->list.add(e));
        return ResponseEntity.ok(list);
    }

    @PostMapping
    @CrossOrigin(origins="*", maxAge = 3600)
    public ResponseEntity create(@Validated @RequestBody Tipo_Vehiculo tipo_vehiculo){
        return ResponseEntity.ok(tipo_vehiculoRepository.save(tipo_vehiculo));
    }

    @DeleteMapping("/{id_Tipo_Vehiculo}")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity delete(@PathVariable Long id_Tipo_Vehiculo){
        if(!tipo_vehiculoRepository.findById(id_Tipo_Vehiculo).isPresent()){
            ResponseEntity.badRequest().build();
        }
        tipo_vehiculoRepository.delete(tipo_vehiculoRepository.findById(id_Tipo_Vehiculo).get());
        return ResponseEntity.ok().build();
    }
    @PutMapping
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<Tipo_Vehiculo> update(@RequestBody Tipo_Vehiculo tipo_vehiculo){
        if(!tipo_vehiculoRepository.findById(tipo_vehiculo.getId_Tipo_Vehiculo()).isPresent()){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(tipo_vehiculoRepository.save(tipo_vehiculo));
    }
    @GetMapping("/{id_Tipo_Vehiculo}")
    @CrossOrigin(origins = "*",maxAge = 3600)
    public ResponseEntity<Tipo_Vehiculo> findById(@PathVariable Long id_Tipo_Vehiculo){
        Optional<Tipo_Vehiculo> tipo_vehiculo = tipo_vehiculoRepository.findById(id_Tipo_Vehiculo);
        if(!tipo_vehiculo.isPresent()){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(tipo_vehiculo.get());
    }
}
