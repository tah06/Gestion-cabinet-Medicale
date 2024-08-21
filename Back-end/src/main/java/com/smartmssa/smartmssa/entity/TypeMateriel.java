package com.smartmssa.smartmssa.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class TypeMateriel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private enum typeName{Stéthoscopes, tensiomètres, glucomètres, thermomètres, hémoglobinomètres, équipement_de_radiologie,scanners_Éclairage_chirurgical,surveillance_des_signes_vitaux,pompes_de_perfusion};

    @OneToMany(mappedBy = "typeMateriel")
    private List<Materiel> materiel;


}
