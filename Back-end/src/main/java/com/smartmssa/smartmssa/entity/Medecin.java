package com.smartmssa.smartmssa.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Medecin extends Utilisateur {


    private String ONMM_Number;
    private int yearsOfExperience;

    @ManyToMany
    @JoinTable(
            name = "medecin_clinique",
            joinColumns = @JoinColumn(name = "medecin_id"),
            inverseJoinColumns = @JoinColumn(name = "clinique_id")
    )
    private List<Clinique> cliniqueMedecins;

    @OneToMany(mappedBy = "medecin")
    private List<Appointement> calendrier;

    @ManyToOne
    @JoinColumn(name = "type_medecin_id")
    private TypeMedecin typeMedecin;

}