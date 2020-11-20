package com.semillerojava.demospring.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.semillerojava.demospring.dominio.ClienteDTO;

public class Utils {
	
	public static final ArrayList<ClienteDTO> clientes = (ArrayList<ClienteDTO>) generarClientes();
	
	public static List<ClienteDTO> generarClientes(){
		ClienteDTO cl1 = new ClienteDTO();
		cl1.setId(1L);
		cl1.setNombre("Jhon");
		cl1.setApellido("Murillo");
		
		ClienteDTO cl2 = new ClienteDTO();
		cl2.setId(2L);
		cl2.setNombre("Andres");
		cl2.setApellido("Agudelo");
		
		List<ClienteDTO> clientes = new ArrayList<>();
		clientes.add(cl1);
		clientes.add(cl2);
		
		return clientes;
		
	}

}
