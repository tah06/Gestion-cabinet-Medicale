package com.smartmssa.smartmssa.services.serviceImpl;

import com.smartmssa.smartmssa.dao.MedecinRepository;
import com.smartmssa.smartmssa.entity.Medecin;
import com.smartmssa.smartmssa.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedecinServiceImpl implements UtilisateurService<Medecin> {

    @Autowired
    private MedecinRepository medecinRepository;

    @Override
    public List<Medecin> getAll() {
        return medecinRepository.findAll();
    }

    @Override
    public Medecin getById(Long id) {
        return medecinRepository.findById(id).orElse(null);
    }

    @Override
    public Medecin save(Medecin utilisateur) {
        return medecinRepository.save(utilisateur);
    }

    @Override
    public void delete(Long id) {
     medecinRepository.deleteById(id);
    }
}
