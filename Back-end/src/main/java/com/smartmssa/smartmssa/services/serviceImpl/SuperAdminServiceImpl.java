package com.smartmssa.smartmssa.services.serviceImpl;

import com.smartmssa.smartmssa.dao.SuperAdminRepository;
import com.smartmssa.smartmssa.entity.SuperAdmin;
import com.smartmssa.smartmssa.entity.Utilisateur;
import com.smartmssa.smartmssa.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperAdminServiceImpl implements UtilisateurService<SuperAdmin> {



    private final SuperAdminRepository superAdminRepository;

    @Autowired
    public SuperAdminServiceImpl(SuperAdminRepository superAdminRepository) {
        this.superAdminRepository = superAdminRepository;
    }

    public List<SuperAdmin> getAll() {
        return superAdminRepository.findAll();
    }

    public SuperAdmin getById(Long id) {
        return superAdminRepository.findById(id).orElse(null);
    }

    public SuperAdmin save(SuperAdmin superAdmin) {
        return superAdminRepository.save(superAdmin);
    }

    public void delete(Long id) {
        superAdminRepository.deleteById(id);

    }
}
