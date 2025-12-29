package com.medflow.model;

import jakarta.persistence.*;

@Entity
@Table(name = "perfis")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome; 
    // ADMIN_PLATAFORMA, ADMIN_CLINICA, PROFISSIONAL, RECEPCIONISTA

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
