package com.cr.ac.una.proyecto.Controllers;

import com.cr.ac.una.proyecto.Models.Log;
import com.cr.ac.una.proyecto.Repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/Log")
public class LogController {
    @Autowired
    private LogRepository logRepository;

    @GetMapping
    @CrossOrigin(origins="*", maxAge = 3600)
    public ResponseEntity<List<Log>> findAll() {
        List<Log> list = new ArrayList<Log>();
        logRepository.findAll().forEach(e-> list.add(e));
        return ResponseEntity.ok(list);
    }

    @PostMapping
    @CrossOrigin(origins="*", maxAge = 3600)
    public ResponseEntity create(@RequestBody Log log){

        return  ResponseEntity.ok(logRepository.save(log));
    }

}
