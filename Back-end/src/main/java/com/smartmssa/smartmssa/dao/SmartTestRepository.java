package com.smartmssa.smartmssa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.smartmssa.smartmssa.entity.SmartTest;

@Repository
public interface SmartTestRepository extends JpaRepository<SmartTest, Long>{
    
    // ***************************************************************************************
    // * Create  your interface REPOSITORY  in the same repo of the interface repository Test*
    // * You can delete the repository of class SmartTest entity       ***********************
    // ***************************************************************************************
}