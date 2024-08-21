package com.smartmssa.smartmssa.web;

import com.smartmssa.smartmssa.entity.Clinique;
import com.smartmssa.smartmssa.services.MaterielService;
import com.smartmssa.smartmssa.services.serviceImpl.CliniqueServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class CliniqueController {

    private final CliniqueServiceImpl cliniqueService;

    @Autowired
    public CliniqueController(CliniqueServiceImpl cliniqueService, MaterielService materielService) {
        this.cliniqueService = cliniqueService;
    }

    @GetMapping("/cliniques")
    public ResponseEntity<List<Clinique>> getAllCliniques() {
        List<Clinique> cliniques = cliniqueService.getAll();
        return ResponseEntity.ok(cliniques);
    }

    @GetMapping("/clinique/{id}")
    public ResponseEntity<Clinique> getCliniqueById(@PathVariable Long id) {
        Clinique clinique = cliniqueService.getById(id);
        if (clinique == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(clinique, HttpStatus.OK);
        }
    }

    @PostMapping("/clinique/create")
    public ResponseEntity<Clinique> createClinique(@RequestBody Clinique clinique) {
        Clinique createdClinique = cliniqueService.save(clinique);
        return new ResponseEntity<>(createdClinique, HttpStatus.CREATED);
    }

    @DeleteMapping("/clinique/{id}")
    public ResponseEntity<Void> deleteClinique(@PathVariable Long id) {
        Clinique existingClinique = cliniqueService.getById(id);
        if (existingClinique != null) {
            cliniqueService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
