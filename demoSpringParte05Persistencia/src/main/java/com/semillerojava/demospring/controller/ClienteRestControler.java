package com.semillerojava.demospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semillero.demospring.servicio.ClienteService;
import com.semillerojava.demospring.dominio.ClienteDTO;
import com.semillerojava.demospring.utils.Utils;

@RestController
@RequestMapping("/v1/cliente")
public class ClienteRestControler {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public List<ClienteDTO> obtenerClientes(){
		return clienteService.obtenerClientes();
	}
	
	@GetMapping("/{id}")
	public ClienteDTO obtenerCLiente(@PathVariable Long id) {
		return clienteService.obtenerClientePorId(id);
	}
	
	@PostMapping
	public ClienteDTO crear(@RequestBody ClienteDTO cliente) {
		return clienteService.crear(cliente);
	}
	
	@PutMapping("/{id}")
	public ClienteDTO crear(@RequestBody ClienteDTO cliente, @PathVariable Long id) {
		return clienteService.modificar(cliente, id);
	}
	
	@DeleteMapping("/{id}")
	public boolean crear(@PathVariable Long id) {
		return clienteService.eliminarCliente(id);
	}

}
