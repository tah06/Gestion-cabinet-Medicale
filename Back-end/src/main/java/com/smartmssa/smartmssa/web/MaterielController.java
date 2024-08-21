package com.smartmssa.smartmssa.web;

import com.smartmssa.smartmssa.entity.Materiel;
import com.smartmssa.smartmssa.services.MaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class MaterielController {

    @Autowired
    private MaterielService materielService;

    @GetMapping("/materiels")
    public ResponseEntity<List<Materiel>> getAllMateriels() {
        List<Materiel> materiels = materielService.getAllMateriels();
        return ResponseEntity.ok(materiels);
    }

    @GetMapping("/materiel/{id}")
    public ResponseEntity<Materiel> getMateriel(@PathVariable Long id) {
        Materiel materiel = materielService.getMaterielById(id);
        if (materiel == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return ResponseEntity.ok(materiel);
        }
    }

    @PostMapping("/materiel/create")
    public ResponseEntity<Materiel> createMateriel(@RequestBody Materiel materiel) {
        Materiel createdMateriel = materielService.saveMateriel(materiel);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdMateriel);
    }

    @DeleteMapping("/materiel/{id}")
    public ResponseEntity<Void> deleteMateriel(@PathVariable Long id) {
        Materiel existingMateriel = materielService.getMaterielById(id);
        if (existingMateriel != null) {
            materielService.deleteMateriel(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
