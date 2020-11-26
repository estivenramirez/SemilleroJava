package com.semillerojava.demospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.semillerojava.demospring.model.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Long>{
	
}
