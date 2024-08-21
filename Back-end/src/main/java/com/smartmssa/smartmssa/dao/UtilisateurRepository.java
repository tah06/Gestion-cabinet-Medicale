package com.smartmssa.smartmssa.dao;

import com.smartmssa.smartmssa.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository<T extends Utilisateur> extends JpaRepository<T,Long> {
}
