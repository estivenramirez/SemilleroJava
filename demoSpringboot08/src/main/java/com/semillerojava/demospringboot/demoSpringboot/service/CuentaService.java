package com.semillerojava.demospringboot.demoSpringboot.service;

import java.util.List;

import com.semillerojava.demospringboot.demoSpringboot.model.Cuenta;


public interface CuentaService {
	List<Cuenta> listar();	
	Cuenta crear(Cuenta cuena);
}
