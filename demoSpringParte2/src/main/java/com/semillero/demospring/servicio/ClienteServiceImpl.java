package com.semillero.demospring.servicio;

import org.springframework.stereotype.Service;

import com.semillerojava.demospring.dominio.Cliente;
import com.semillerojava.demospring.utils.Utils;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Override
	public Cliente obtenerClientePorId(Long id) {
		Cliente respuesta = null;
		for (Cliente c : Utils.clientes) {
			if(c.getId().equals(id)) {
				respuesta = c;
			}
		}
		return respuesta;
	}

}
