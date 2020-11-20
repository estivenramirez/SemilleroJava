package com.semillero.demospring.servicio;

import java.util.List;

import com.semillerojava.demospring.model.Persona;

public interface PersonaService {

	List<Persona> listar();
	Persona crear(Persona persona);
	boolean eliminar(Long id);
}
