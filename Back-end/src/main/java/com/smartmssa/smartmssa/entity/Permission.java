package com.smartmssa.smartmssa.entity;

import jakarta.persistence.*;

@Entity
public class Permission {


@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String name;
private String description;
@ManyToOne
@JoinColumn(name = "role_id")
private Role role;
}
