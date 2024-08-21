package com.smartmssa.smartmssa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.List;

@Setter
@Getter
@Entity
public class Clinique extends Utilisateur{

    private double longitude;

    private double latitude;

    @ManyToMany(mappedBy = "cliniqueMedecins")
    private List<Medecin> medecins;

        @OneToMany(mappedBy = "clinique")
        private List<Materiel> materiels;

    private Boolean ispublic;

    private Time heureOuverture;

    private Time heureFermeture;

}
