package com.smartmssa.smartmssa.services.serviceImpl;

import com.smartmssa.smartmssa.dao.MaterielRepository;
import com.smartmssa.smartmssa.entity.Materiel;
import com.smartmssa.smartmssa.services.MaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterielServiceImpl implements MaterielService {

    @Autowired
    private MaterielRepository materielRepository;

    public List<Materiel> getAllMateriels() {
        return materielRepository.findAll();
    }

    @Override
    public Materiel getMaterielById(long id) {
        return materielRepository.findById(id).orElse(null);
    }

    @Override
    public Materiel saveMateriel(Materiel materiel) {
        return materielRepository.save(materiel);
    }

    @Override
    public void deleteMateriel(long id) {
        materielRepository.deleteById(id);
    }
}
