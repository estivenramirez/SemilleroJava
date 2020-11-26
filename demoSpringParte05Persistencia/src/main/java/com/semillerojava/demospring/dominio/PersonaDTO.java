package com.semillerojava.demospring.dominio;

import java.util.List;

import com.semillerojava.demospring.model.Cuenta;
import com.semillerojava.demospring.model.Persona;

public class PersonaDTO {

	private Long id;
	
	private String nombres;
	private String apellidos;
	private String telefono;
	
	public static PersonaDTO toDTO(Persona personas) {
		PersonaDTO dto = new PersonaDTO();
		dto.setApellidos(personas.getApellidos());
		dto.setNombres(personas.getNombres());
		dto.setId(personas.getId());
		dto.setTelefono(personas.getTelefono());
		return dto;
	}
	
	private List<Cuenta> cuentas;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public List<Cuenta> getCuentas() {
		return cuentas;
	}
	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
	
}
