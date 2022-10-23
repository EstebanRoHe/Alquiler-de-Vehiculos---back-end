package com.cr.ac.una.proyecto.Controllers;

import com.cr.ac.una.proyecto.Models.Vehiculo;
import com.cr.ac.una.proyecto.Repositories.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/Vehiculo")
public class VehiculoController {
    @Autowired
    private VehiculoRepository vehiculoRepository;

    @GetMapping
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<List<Vehiculo>> findAll(){
        List<Vehiculo> list = new ArrayList<Vehiculo>();
        vehiculoRepository.findAll().forEach(e->list.add(e));
        return ResponseEntity.ok(list);
    }

    @PostMapping
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity create(@RequestBody Vehiculo vehiculo){
        return ResponseEntity.ok(vehiculoRepository.save(vehiculo));
    }
    @DeleteMapping("/{id_Vehiculo}")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity delete(@PathVariable Long id_Vehiculo){
        if(!vehiculoRepository.findById(id_Vehiculo).isPresent()){
            ResponseEntity.badRequest().build();
        }
        vehiculoRepository.delete(vehiculoRepository.findById(id_Vehiculo).get());
        return ResponseEntity.ok().build();
    }

    @PutMapping
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<Vehiculo> update(@RequestBody Vehiculo vehiculo){
        if(!vehiculoRepository.findById(vehiculo.getId_Vehiculo()).isPresent()){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(vehiculoRepository.save(vehiculo));
    }

    @GetMapping("/{id_Vehiculo}")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<Vehiculo> findById(@PathVariable Long id_Vehiculo ){
        Optional<Vehiculo> vehiculo = vehiculoRepository.findById(id_Vehiculo);
        if(!vehiculo.isPresent()){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(vehiculo.get());

    }
}
