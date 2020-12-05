package com.semillerojava.demospringboot.demoSpringboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.semillerojava.demospringboot.demoSpringboot.model.Persona;


public interface PersonaRepository extends JpaRepository<Persona, Long>{
	Optional<Persona> findById(Long id);

	@Query("from Persona p")
	List<Persona> obtenerTodos();
	
	List<Persona> findAllByOrderByApellidosAsc();

	@Query(value="select p.nombres from Persona p"/*, nativeQuery=true*/)
	List<String> obtenerNombres();
}
