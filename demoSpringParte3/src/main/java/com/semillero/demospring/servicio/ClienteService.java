package com.semillero.demospring.servicio;

import java.util.List;

import com.semillerojava.demospring.dominio.Cliente;

public interface ClienteService {

	List<Cliente> obtenerClientes();
	Cliente obtenerClientePorId(Long id);
	Cliente crear(Cliente cliente);
	Cliente modificar(Cliente cliente, Long id);
	boolean eliminarCliente(Long id);

}
