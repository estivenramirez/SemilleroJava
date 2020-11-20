package com.semillero.demospring.servicio;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.semillerojava.demospring.dominio.ClienteDTO;

@Service
public class ClienteServiceImpl implements ClienteService{

	private List<ClienteDTO> clientes;
	
	@PostConstruct
	private void init() {
		clientes = new ArrayList<>();
		clientes.add(new ClienteDTO(1L, "Pedro", "Correa", "correo1@correo.test", new Date(), "479879864"));
		clientes.add(new ClienteDTO(2L, "Carlos Pedro", "Correa", "correo1@correo.test", new Date(), "776474747"));
		clientes.add(new ClienteDTO(3L, "Maria Jose", "Correa", "correo1@correo.test", new Date(), "21545587575"));
		clientes.add(new ClienteDTO(4L, "Luis", "Correa", "correo1@correo.test", new Date(), "768674575"));
		clientes.add(new ClienteDTO(5L, "Marcos", "Correa", "correo1@correo.test", new Date(), "778798988789"));
	}
	
	@Override
	public ClienteDTO obtenerClientePorId(Long id) {
		return this.clientes
					.stream()
					.filter(clte -> clte.getId().equals(id)).findFirst().orElse(null);
	}

	@Override
	public List<ClienteDTO> obtenerClientes() {
		return this.clientes;
	}

	@Override
	public ClienteDTO crear(ClienteDTO cliente) {
		Long id = this.clientes.stream().mapToLong(ClienteDTO::getId).max().orElse(0) + 1L;
		cliente.setId(id);
		this.clientes.add(cliente);
		return cliente;
	}

	@Override
	public ClienteDTO modificar(ClienteDTO cliente, Long id) {
		
		ClienteDTO clienteModificar = this.obtenerClientePorId(id);
		
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
		
		ClienteDTO clienteModificar = this.obtenerClientePorId(id);
		
		if(clienteModificar == null) {
			return false;
		}
	
		Iterator<ClienteDTO> iterator = this.clientes.iterator();
		
		while(iterator.hasNext()) {
			if(iterator.next().getId().equals(id)) {
				iterator.remove();
				break;
			}
		}
		
		return true;
	}

}
