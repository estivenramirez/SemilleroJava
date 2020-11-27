package com.semillerojava.demospring.servicio;

import java.util.List;

import com.semillerojava.demospring.dominio.ClienteDTO;

public interface ClienteService {

	List<ClienteDTO> obtenerClientes();
	ClienteDTO obtenerClientePorId(Long id);
	ClienteDTO crear(ClienteDTO cliente);
	ClienteDTO modificar(ClienteDTO cliente, Long id);
	boolean eliminarCliente(Long id);

}
