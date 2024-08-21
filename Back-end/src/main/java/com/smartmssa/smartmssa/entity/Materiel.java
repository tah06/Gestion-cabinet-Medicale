package com.smartmssa.smartmssa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
@Entity
public class Materiel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String description;
    private String manufacturer;
    private String model;
    private String serialNumber;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date purshaseDate;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date lastMaintenanceDate;
    private String statue;


    @ManyToOne
    @JoinColumn(name = "clinique_id")
    private Clinique clinique;

    @ManyToOne
    @JoinColumn(name = "type_materiel_id")
    private TypeMateriel typeMateriel;

}