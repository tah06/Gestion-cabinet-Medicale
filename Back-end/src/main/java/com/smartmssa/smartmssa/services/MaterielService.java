package com.smartmssa.smartmssa.services;

import com.smartmssa.smartmssa.entity.Materiel;

import java.util.List;

public interface MaterielService {

    public List<Materiel> getAllMateriels();
    public Materiel getMaterielById(long id);
    public Materiel saveMateriel(Materiel materiel);
    public void deleteMateriel(long id);

}
