package com.medflow.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String senha;

    @ManyToOne
    @JoinColumn(name = "perfil_id")
    private Perfil perfil;

    @ManyToOne
    @JoinColumn(name = "clinica_id")
    private Clinica clinica;

    private boolean ativo = true;

    // getters e setters
}
