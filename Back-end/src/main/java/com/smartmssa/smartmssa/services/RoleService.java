package com.smartmssa.smartmssa.services;

import com.smartmssa.smartmssa.entity.Materiel;
import com.smartmssa.smartmssa.entity.Role;

import java.util.List;


public interface RoleService {


    public List<Role> getAllRoles();
    public Role getRoleById(long id);
    public Role saveRole(Role role);
    public void deleteRole(long id);


}
