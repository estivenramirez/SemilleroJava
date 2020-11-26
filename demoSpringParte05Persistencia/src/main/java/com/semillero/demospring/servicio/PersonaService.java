package com.semillero.demospring.servicio;

import java.util.List;
import java.util.Optional;

import com.semillerojava.demospring.model.Persona;

public interface PersonaService {

	List<Persona> listar();
	Persona crear(Persona persona);
	boolean eliminar(Long id);
	Persona actualizar(Long id, Persona persona);
}
