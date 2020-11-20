package com.semillerojava.demospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semillero.demospring.servicio.PersonaService;
import com.semillerojava.demospring.model.Persona;

@RestController
@RequestMapping("/v1/persona")
public class PersonaRestController {
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping
	public List<Persona> obtenerPersonas(){
		return personaService.listar();
	}

	@PostMapping
	public Persona crear(@RequestBody Persona persona) {
		return personaService.crear(persona);
	}
	
	@DeleteMapping("/{id}")
	public boolean eliminar(@PathVariable Long id) {
		return personaService.eliminar(id);
	}
	
}
