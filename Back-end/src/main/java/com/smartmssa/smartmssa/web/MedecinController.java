package com.smartmssa.smartmssa.web;

import com.smartmssa.smartmssa.entity.Medecin;
import com.smartmssa.smartmssa.services.serviceImpl.MedecinServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class MedecinController {

    private final MedecinServiceImpl medecinService;

    public MedecinController(MedecinServiceImpl medecinService) {
        this.medecinService = medecinService;
    }

    @GetMapping("/medecins")
    public ResponseEntity<List<Medecin>> getAllMedecins() {
        List<Medecin> medecins = medecinService.getAll();
        return ResponseEntity.ok(medecins);
    }

    @GetMapping("/medecin/{id}")
    public ResponseEntity<Medecin> getMedecinById(@PathVariable Long id) {
        Medecin medecin = medecinService.getById(id);
        if (medecin == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(medecin, HttpStatus.OK);
        }
    }

    @PostMapping("/medecin/create")
    public ResponseEntity<Medecin> createMedecin(@RequestBody Medecin medecin) {
        Medecin createdMedecin = medecinService.save(medecin);
        return new ResponseEntity<>(createdMedecin, HttpStatus.CREATED);
    }

    @DeleteMapping("/medecin/{id}")
    public ResponseEntity<Void> deleteMedecin(@PathVariable Long id) {
        Medecin existingMedecin = medecinService.getById(id);
        if (existingMedecin != null) {
            medecinService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
