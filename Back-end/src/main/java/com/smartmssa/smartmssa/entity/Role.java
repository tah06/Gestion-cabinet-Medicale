package com.smartmssa.smartmssa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
public class Role {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public enum Rolename {
        SuperAdmin,
        Clinique,
        Medecin
    }

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private Rolename rolename;

    @Getter
    @Setter
    @OneToMany(mappedBy = "role")
    private List<Permission> permissions;

    @Getter
    @Setter
    @ManyToMany(mappedBy = "role")
    private List<Utilisateur> users;
}

