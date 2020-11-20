package com.semillerojava.demospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.semillerojava.demospring.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
