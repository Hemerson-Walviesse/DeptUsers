package com.departamentos.userdep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.departamentos.userdep.entities.Usuarios;

public interface userRepository  extends JpaRepository<Usuarios, Long>{
    
}
