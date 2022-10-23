package com.cr.ac.una.proyecto.Controllers;

import com.cr.ac.una.proyecto.Models.Persona;
import com.cr.ac.una.proyecto.Repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/Persona")
public class PersonaController {
    @Autowired
    private PersonaRepository personaRepository;

    @GetMapping
    @CrossOrigin(origins="*", maxAge = 3600)
    public ResponseEntity<List<Persona>> findAll() {
        List<Persona> list = new ArrayList<Persona>();
        personaRepository.findAll().forEach(e-> list.add(e));
        return ResponseEntity.ok(list);
    }

    @PostMapping
    @CrossOrigin(origins="*", maxAge = 3600)
    public ResponseEntity create(@RequestBody Persona persona){
        return  ResponseEntity.ok(personaRepository.save(persona));
    }

    @DeleteMapping("/{id_persona}")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity delete(@PathVariable Long id_persona) {
        if (!personaRepository.findById(id_persona).isPresent()) {
            ResponseEntity.badRequest().build();
        }
        personaRepository.delete(personaRepository.findById(id_persona).get());
        return ResponseEntity.ok().build();
    }
    @PutMapping
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<Persona> update(@RequestBody Persona persona) {
        if (!personaRepository.findById(persona.getId_persona()).isPresent()) {
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(personaRepository.save(persona));
    }

    @GetMapping("/{id_persona}")
    @CrossOrigin(origins = "*",maxAge = 3600)
    public ResponseEntity<Persona> findById(@PathVariable Long id_persona) {
        Optional<Persona> persona = personaRepository.findById(id_persona);
        if (!persona.isPresent()) {
            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(persona.get());
    }
}
