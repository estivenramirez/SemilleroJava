package com.semillerojava.demospringboot.demoSpringboot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.semillerojava.demospringboot.demoSpringboot.model.Persona;
import com.semillerojava.demospringboot.demoSpringboot.service.PersonaService;


@RestController
@RequestMapping("/v1/persona")
public class PersonaRestController {

	@Autowired
	private PersonaService personaService;
	
	
	@GetMapping
	public List<Persona> obtenerPersonas(){
		return personaService.listar();
	}
	
	@GetMapping("/obtenerPersonasPorNombre")
	public List<Persona> obtenerPersonasPorNombre(@RequestParam(name = "nombre", required = true) String nombre) {
		return personaService.obtenerPersonasPorNombre(nombre);
	}

	@GetMapping("/obtenerPersonasConSusCuentas")
	public List<Persona> obtenerPersonasConSusCuentas() {
		return personaService.obtenerPersonasConSusCuentas();
	}
	
	
	@GetMapping("obtenerNombres")
	public List<String> obtenerNombres(){
		return personaService.listarNombres();
	}

	@PostMapping
	public Persona crear(@RequestBody Persona persona) {
		return personaService.crear(persona);
	}
	
	@DeleteMapping("/{id}")
	public boolean eliminar(@PathVariable Long id) {
		return personaService.eliminar(id);
	}
	
	@PutMapping("/{id}")
	public Persona actualizar(@PathVariable Long id ,@RequestBody Persona persona) {
		return personaService.actualizar(id, persona);
	}
	
}
