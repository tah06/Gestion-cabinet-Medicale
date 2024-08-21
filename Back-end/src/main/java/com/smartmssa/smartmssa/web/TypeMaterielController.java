package com.smartmssa.smartmssa.web;


import com.smartmssa.smartmssa.entity.TypeMateriel;
import com.smartmssa.smartmssa.services.serviceImpl.TypeMaterielServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class TypeMaterielController {

    private final TypeMaterielServiceImpl typeMaterielService;

    @Autowired
    public TypeMaterielController(TypeMaterielServiceImpl typeMaterielService) {
        this.typeMaterielService = typeMaterielService;
    }

    @GetMapping("/typemateriels")
    public ResponseEntity<List<TypeMateriel>> getAllTypeMateriels() {
        List<TypeMateriel> typeMateriels = typeMaterielService.getAll();
        return ResponseEntity.ok(typeMateriels);
    }

    @GetMapping("/typemateriel/{id}")
    public ResponseEntity<TypeMateriel> getTypeMateriel(@PathVariable Long id) {
        TypeMateriel typeMateriel = typeMaterielService.getById(id);
        if (typeMateriel == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return ResponseEntity.ok(typeMateriel);
        }
    }

    @PostMapping("/typemateriel/create")
    public ResponseEntity<TypeMateriel> createTypeMateriel(@RequestBody TypeMateriel typeMateriel) {
        TypeMateriel createdTypeMateriel = typeMaterielService.save(typeMateriel);
        return new ResponseEntity<>(createdTypeMateriel, HttpStatus.CREATED);
    }

    @DeleteMapping("/typemateriel/{id}")
    public ResponseEntity<Void> deleteTypeMateriel(@PathVariable Long id) {
        TypeMateriel existingTypeMateriel = typeMaterielService.getById(id);
        if (existingTypeMateriel != null) {
            typeMaterielService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
