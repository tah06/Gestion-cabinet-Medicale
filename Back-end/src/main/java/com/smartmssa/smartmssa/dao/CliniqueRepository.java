package com.smartmssa.smartmssa.dao;

import com.smartmssa.smartmssa.entity.Clinique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CliniqueRepository extends JpaRepository<Clinique, Long> {
}
