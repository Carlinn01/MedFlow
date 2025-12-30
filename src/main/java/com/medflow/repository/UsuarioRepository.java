package com.medflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.medflow.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}