package com.smartmssa.smartmssa.dao;

import com.smartmssa.smartmssa.entity.Clinique;
import com.smartmssa.smartmssa.entity.SuperAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperAdminRepository extends JpaRepository<SuperAdmin,Long>{
}
