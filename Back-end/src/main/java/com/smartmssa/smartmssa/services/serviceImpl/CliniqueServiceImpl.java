package com.smartmssa.smartmssa.services.serviceImpl;

import com.smartmssa.smartmssa.dao.CliniqueRepository;
import com.smartmssa.smartmssa.entity.Clinique;
import com.smartmssa.smartmssa.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CliniqueServiceImpl implements UtilisateurService<Clinique> {

    private final CliniqueRepository cliniqueRepository;

    @Autowired
    public CliniqueServiceImpl(CliniqueRepository cliniqueRepository) {
        this.cliniqueRepository = cliniqueRepository;
    }

    public List<Clinique> getAll() {
        return cliniqueRepository.findAll();
    }

    public Clinique getById(Long id) {
        return cliniqueRepository.findById(id).orElse(null);
    }

    public Clinique save(Clinique clinique) {
        return cliniqueRepository.save(clinique);
    }

    public void delete(Long id) {
        cliniqueRepository.deleteById(id);
    }
}
