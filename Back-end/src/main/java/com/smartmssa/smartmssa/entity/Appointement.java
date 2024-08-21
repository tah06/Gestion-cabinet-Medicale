package com.smartmssa.smartmssa.entity;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
public class Appointement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Time heureDebut;
    private Time heureFin;
    @ManyToOne
    private Medecin medecin;

}
