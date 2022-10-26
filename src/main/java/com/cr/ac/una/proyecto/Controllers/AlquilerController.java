package com.cr.ac.una.proyecto.Controllers;

import com.cr.ac.una.proyecto.Models.Alquiler;
import com.cr.ac.una.proyecto.Repositories.AlquilerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/Alquiler")
public class AlquilerController {
    @Autowired
    private AlquilerRepository alquilerRepository;

    @GetMapping
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<List<Alquiler>> findALL(){
        List<Alquiler> list = new ArrayList<Alquiler>();
        alquilerRepository.findAll().forEach(e->list.add(e));
        return ResponseEntity.ok(list);
    }

    @PostMapping
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity create( @Validated @RequestBody Alquiler alquiler){
        return ResponseEntity.ok(alquilerRepository.save(alquiler));
    }

    @DeleteMapping("/{id_Alquiler}")
    @CrossOrigin(origins = "*",maxAge = 3600)
    public ResponseEntity delete(@PathVariable Long id_Alquiler){
        if(!alquilerRepository.findById(id_Alquiler).isPresent()){
            ResponseEntity.badRequest().build();
        }
        alquilerRepository.delete(alquilerRepository.findById(id_Alquiler).get());
        return ResponseEntity.ok().build();
    }

    @PutMapping
    @CrossOrigin(origins = "*",maxAge = 3600)
    public ResponseEntity<Alquiler> update(@RequestBody Alquiler alquiler){
        if(!alquilerRepository.findById(alquiler.getId_Alquiler()).isPresent()){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(alquilerRepository.save(alquiler));
    }
    @GetMapping("/{id_Alquiler}")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<Alquiler> findById(@PathVariable Long id_Alquiler){
        Optional<Alquiler>alquiler=alquilerRepository.findById(id_Alquiler);
        if(!alquiler.isPresent()){
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(alquiler.get());
    }

}
