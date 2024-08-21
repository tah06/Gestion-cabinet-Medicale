package com.smartmssa.smartmssa.web;

import com.smartmssa.smartmssa.entity.Permission;
import com.smartmssa.smartmssa.services.serviceImpl.PermissionServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class PermissionController {

    private final PermissionServiceImpl permissionService;

    public PermissionController(PermissionServiceImpl permissionService) {
        this.permissionService = permissionService;
    }

    @GetMapping("/permissions")
    public ResponseEntity<List<Permission>> getAllPermissions() {
        List<Permission> permissions = permissionService.getAllPermissions();
        return ResponseEntity.ok(permissions);
    }

    @GetMapping("/permission/{id}")
    public ResponseEntity<Permission> getPermissionById(@PathVariable Long id) {
        Permission permission = permissionService.getPermissionById(id);
        if (permission == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(permission, HttpStatus.OK);
        }
    }

    @PostMapping("/permission/create")
    public ResponseEntity<Permission> createPermission(@RequestBody Permission permission) {
        Permission createdPermission = permissionService.savePermission(permission);
        return new ResponseEntity<>(createdPermission, HttpStatus.CREATED);
    }

    @DeleteMapping("/permission/{id}")
    public ResponseEntity<Void> deletePermission(@PathVariable Long id) {
        Permission existingPermission = permissionService.getPermissionById(id);
        if (existingPermission != null) {
            permissionService.deletePermission(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
