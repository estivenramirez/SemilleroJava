package com.semillero.demospring.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semillerojava.demospring.model.Persona;
import com.semillerojava.demospring.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository personaRepository;
	
	@Override
	public List<Persona> listar() {
		return personaRepository.findAll();
	}

	@Override
	public Persona crear(Persona persona) {
		return personaRepository.save(persona);
	}

	@Override
	public boolean eliminar(Long id) {
		
		if(personaRepository.existsById(id)) {
			personaRepository.deleteById(id);
			return true;
		}
		
		return false;
	}
}
