package com.semillerojava.demospring.servicio;

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
//		return personaRepository.obtenerTodos();
		return personaRepository.findAllByOrderByApellidosAsc();
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

	@Override
	public Persona actualizar(Long id, Persona persona) {
		Persona personaEnBd = personaRepository.findById(id).orElse(null);
		if(persona != null) {
			personaEnBd.setApellidos(persona.getApellidos());
			personaEnBd.setNombres(persona.getNombres());
			personaEnBd.setTelefono(persona.getTelefono());
		}
		
		return personaRepository.save(personaEnBd);
	}

	@Override
	public List<String> listarNombres() {
		return personaRepository.obtenerNombres();
	}
}
