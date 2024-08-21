package com.smartmssa.smartmssa.services;

import com.smartmssa.smartmssa.entity.Utilisateur;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UtilisateurService<T extends Utilisateur>{


    public List<T> getAll();
    public T getById(Long id);
    public T save(T utilisateur);
    public void delete(Long id);

}
