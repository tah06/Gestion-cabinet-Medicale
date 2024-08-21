package com.smartmssa.smartmssa.web;

import com.smartmssa.smartmssa.entity.*;
import com.smartmssa.smartmssa.services.serviceImpl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class SuperAdminController {

    private final SuperAdminServiceImpl superAdminService;

    @Autowired
    public SuperAdminController(SuperAdminServiceImpl superAdminService) {
        this.superAdminService = superAdminService;
    }

    @GetMapping("/superadmins")
    public ResponseEntity<List<SuperAdmin>> getAllSuperAdmins() {
        List<SuperAdmin> superAdmins = superAdminService.getAll();
        return ResponseEntity.ok(superAdmins);
    }

    @GetMapping("/superadmin/{id}")
    public ResponseEntity<SuperAdmin> getSuperAdminById(@PathVariable Long id) {
        SuperAdmin superAdmin = superAdminService.getById(id);
        if (superAdmin != null) {
            return new ResponseEntity<>(superAdmin, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/superadmin/create")
    public ResponseEntity<SuperAdmin> createSuperAdmin(@RequestBody SuperAdmin superAdmin) {
        SuperAdmin createdSuperAdmin = superAdminService.save(superAdmin);
        return new ResponseEntity<>(createdSuperAdmin, HttpStatus.CREATED);
    }

    @DeleteMapping("/superadmin/{id}")
    public ResponseEntity<Void> deleteSuperAdmin(@PathVariable Long id) {
        SuperAdmin existingSuperAdmin = superAdminService.getById(id);
        if (existingSuperAdmin != null) {
            superAdminService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
