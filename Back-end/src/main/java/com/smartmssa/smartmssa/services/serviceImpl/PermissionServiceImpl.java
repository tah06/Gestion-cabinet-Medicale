package com.smartmssa.smartmssa.services.serviceImpl;

import com.smartmssa.smartmssa.dao.PermissionRepository;
import com.smartmssa.smartmssa.entity.Permission;
import com.smartmssa.smartmssa.services.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {


    @Autowired
    private PermissionRepository permissionRepository;


    public List<Permission> getAllPermissions() {
        return permissionRepository.findAll();
    }

    public Permission getPermissionById(long id) {
        return permissionRepository.findById(id).orElse(null);
    }

    public Permission savePermission(Permission permission) {
        return permissionRepository.save(permission);
    }

    public void deletePermission(long id) {
        permissionRepository.deleteById(id);
    }
}
