package com.smartmssa.smartmssa.entity;

import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SmartTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String welcome = "Welcome to smart ms sam, Do somthing amazing !";
    private String goodbye = "Goodbye, you can :)";
    
    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;
    
    // *********************************************************************************
    // * Create  your class entity in the same repo of the class entity Test ***********
    // * You can delete the class entity  test *****************************************
    // *********************************************************************************
}