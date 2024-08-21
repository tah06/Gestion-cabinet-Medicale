package com.smartmssa.smartmssa.services;

import com.smartmssa.smartmssa.dao.PermissionRepository;
import com.smartmssa.smartmssa.entity.Permission;
import com.smartmssa.smartmssa.entity.Role;

import java.util.List;

public interface PermissionService {

    public List<Permission> getAllPermissions();
    public Permission getPermissionById(long id);
    public Permission savePermission(Permission permission);
    public void deletePermission(long id);
}
