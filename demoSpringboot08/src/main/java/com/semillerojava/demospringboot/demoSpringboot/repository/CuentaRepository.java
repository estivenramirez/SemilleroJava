package com.semillerojava.demospringboot.demoSpringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.semillerojava.demospringboot.demoSpringboot.model.Cuenta;


public interface CuentaRepository extends JpaRepository<Cuenta, Long>{

}
