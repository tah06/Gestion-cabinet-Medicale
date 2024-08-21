package com.smartmssa.smartmssa.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class TypeMedecin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String typeName;

    public enum Specialite {
        Générale, Gynécologie, Pédiatrie, Dentisterie, Orl, Cardiologie, Endocrinologie, Dermatologie, Hépato_Gastro_Entérologue
    };

    private Specialite specialite;

    @OneToMany(mappedBy = "typeMedecin")
    private List<Medecin> medecins;

}
