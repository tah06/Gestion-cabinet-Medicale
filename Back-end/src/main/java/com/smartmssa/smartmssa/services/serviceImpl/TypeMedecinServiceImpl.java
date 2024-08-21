package com.smartmssa.smartmssa.services.serviceImpl;

import com.smartmssa.smartmssa.dao.TypeMedecinRepository;
import com.smartmssa.smartmssa.entity.TypeMedecin;
import com.smartmssa.smartmssa.services.TypeMedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeMedecinServiceImpl implements TypeMedecinService {

    private final TypeMedecinRepository typeMedecinRepository;

    @Autowired
    public TypeMedecinServiceImpl(TypeMedecinRepository typeMedecinRepository) {
        this.typeMedecinRepository = typeMedecinRepository;
    }

    @Override
    public TypeMedecin save(TypeMedecin typeMedecin) {
        return typeMedecinRepository.save(typeMedecin);
    }

    @Override
    public List<TypeMedecin> getAll() {
        return typeMedecinRepository.findAll();
    }

    @Override
    public TypeMedecin getById(Long id) {
        return typeMedecinRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        typeMedecinRepository.deleteById(id);
    }
}
