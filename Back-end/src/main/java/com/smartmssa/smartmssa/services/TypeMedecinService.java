package com.smartmssa.smartmssa.services;

import com.smartmssa.smartmssa.entity.TypeMedecin;

import java.util.List;

public interface TypeMedecinService {
    TypeMedecin save(TypeMedecin typeMedecin);
    List<TypeMedecin> getAll();
    TypeMedecin getById(Long id);
    void delete(Long id);

}
