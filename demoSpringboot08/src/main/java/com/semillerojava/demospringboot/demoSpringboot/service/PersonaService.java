package com.semillerojava.demospringboot.demoSpringboot.service;

import java.util.List;

import com.semillerojava.demospringboot.demoSpringboot.model.Persona;


public interface PersonaService {
	List<Persona> listar();
	Persona crear(Persona persona);
	boolean eliminar(Long id);
	Persona actualizar(Long id, Persona persona);
	List<String> listarNombres();
	
	//
	List<Persona> obtenerPersonasPorNombre(String nombre);
	List<Persona> obtenerPersonasConSusCuentas();
}
