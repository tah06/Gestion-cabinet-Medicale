package com.smartmssa.smartmssa.services.serviceImpl;

import com.smartmssa.smartmssa.dao.TypeMaterielRepository;
import com.smartmssa.smartmssa.entity.TypeMateriel;
import com.smartmssa.smartmssa.services.TypeMaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeMaterielServiceImpl implements TypeMaterielService {

    private final TypeMaterielRepository typeMaterielRepository;

    @Autowired
    public TypeMaterielServiceImpl(TypeMaterielRepository typeMaterielRepository) {
        this.typeMaterielRepository = typeMaterielRepository;
    }

    @Override
    public TypeMateriel save(TypeMateriel typeMateriel) {
        return typeMaterielRepository.save(typeMateriel);
    }

    @Override
    public List<TypeMateriel> getAll() {
        return typeMaterielRepository.findAll();
    }

    @Override
    public TypeMateriel getById(Long id) {
        return typeMaterielRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        typeMaterielRepository.deleteById(id);
    }
}
