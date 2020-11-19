package com.semillerojava.demospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.semillero.demospring.servicio.ClienteService;
import com.semillerojava.demospring.dominio.Cliente;
import com.semillerojava.demospring.utils.Utils;

@RestController
@RequestMapping("/rest/cliente")
public class ClienteRestControler {
	
	@Autowired
	private ClienteService clienteService;

	
	@GetMapping
	public List<Cliente> obtenerClientes(){
		return Utils.clientes;
	}
	
	@GetMapping("/{id}")
	public Cliente obtenerCLiente(@PathVariable Long id) {
		return clienteService.obtenerClientePorId(id);
	}
	
}
