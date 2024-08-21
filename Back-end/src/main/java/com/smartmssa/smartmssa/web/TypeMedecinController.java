package com.smartmssa.smartmssa.web;


import com.smartmssa.smartmssa.entity.TypeMedecin;
import com.smartmssa.smartmssa.services.serviceImpl.TypeMedecinServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class TypeMedecinController {

    private final TypeMedecinServiceImpl typeMedecinService;

    public TypeMedecinController(TypeMedecinServiceImpl typeMedecinService) {
        this.typeMedecinService = typeMedecinService;
    }

    @GetMapping("/typemedecins")
    public ResponseEntity<List<TypeMedecin>> getAllTypeMedecin() {
        List<TypeMedecin> typeMedecins = typeMedecinService.getAll();
        return ResponseEntity.ok(typeMedecins);
    }

    @GetMapping("/typemedecin/{id}")
    public ResponseEntity<TypeMedecin> getTypeMedecin(@PathVariable Long id) {
        TypeMedecin typeMedecin = typeMedecinService.getById(id);
        if (typeMedecin == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return ResponseEntity.ok(typeMedecin);
        }
    }

    @PostMapping("/typemedecin/create")
    public ResponseEntity<TypeMedecin> createTypeMedecin(@RequestBody TypeMedecin typeMedecin) {
        TypeMedecin createdTypeMedecin = typeMedecinService.save(typeMedecin);
        return new ResponseEntity<>(createdTypeMedecin, HttpStatus.CREATED);
    }

    @DeleteMapping("/typemedecin/{id}")
    public ResponseEntity<Void> deleteTypeMateriel(@PathVariable Long id) {
        TypeMedecin existingTypeMedecin = typeMedecinService.getById(id);
        if (existingTypeMedecin != null) {
            typeMedecinService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
