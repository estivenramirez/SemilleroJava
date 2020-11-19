package com.semillero.demospring.servicio;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.semillerojava.demospring.dominio.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService{

	private List<Cliente> clientes;
	
	@PostConstruct
	private void init() {
		clientes = new ArrayList<>();
		clientes.add(new Cliente(1L, "Pedro", "Correa", "correo1@correo.test", new Date(), "479879864"));
		clientes.add(new Cliente(2L, "Carlos Pedro", "Correa", "correo1@correo.test", new Date(), "776474747"));
		clientes.add(new Cliente(3L, "Maria Jose", "Correa", "correo1@correo.test", new Date(), "21545587575"));
		clientes.add(new Cliente(4L, "Luis", "Correa", "correo1@correo.test", new Date(), "768674575"));
		clientes.add(new Cliente(5L, "Marcos", "Correa", "correo1@correo.test", new Date(), "778798988789"));
	}
	
	@Override
	public Cliente obtenerClientePorId(Long id) {
		return this.clientes
					.stream()
					.filter(clte -> clte.getId().equals(id)).findFirst().orElse(null);
	}

	@Override
	public List<Cliente> obtenerClientes() {
		return this.clientes;
	}

	@Override
	public Cliente crear(Cliente cliente) {
		Long id = this.clientes.stream().mapToLong(Cliente::getId).max().orElse(0) + 1L;
		cliente.setId(id);
		this.clientes.add(cliente);
		return cliente;
	}

	@Override
	public Cliente modificar(Cliente cliente, Long id) {
		
		Cliente clienteModificar = this.obtenerClientePorId(id);
		
		if(clienteModificar != null) {
			clienteModificar.setNombre(cliente.getNombre());
			clienteModificar.setApellido(cliente.getApellido());
			clienteModificar.setFechaNacimiento(cliente.getFechaNacimiento());
			clienteModificar.setNumeroTelefono(cliente.getNumeroTelefono());
		}
		
		return clienteModificar;
	}

	@Override
	public boolean eliminarCliente(Long id) {
		
		Cliente clienteModificar = this.obtenerClientePorId(id);
		
		if(clienteModificar == null) {
			return false;
		}
	
		Iterator<Cliente> iterator = this.clientes.iterator();
		
		while(iterator.hasNext()) {
			if(iterator.next().getId().equals(id)) {
				iterator.remove();
				break;
			}
		}
		
		return true;
	}

}
