package com.departamentos.userdep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.departamentos.userdep.entities.Departamentos;

public interface depRepository extends JpaRepository<Departamentos, Long> {
    
}
