package com.smartmssa.smartmssa.dao;

import com.smartmssa.smartmssa.entity.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterielRepository extends JpaRepository<Materiel, Long> {
}
