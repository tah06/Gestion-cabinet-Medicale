package com.smartmssa.smartmssa.services;

import com.smartmssa.smartmssa.entity.TypeMateriel;

import java.util.List;

public interface TypeMaterielService {

    TypeMateriel save(TypeMateriel typeMateriel);
    List<TypeMateriel> getAll();
    TypeMateriel getById(Long id);
    void delete(Long id);
}
