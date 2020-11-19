package com.semillerojava.demospring.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.semillerojava.demospring.dominio.Cliente;

public class Utils {
	
	public static final ArrayList<Cliente> clientes = (ArrayList<Cliente>) generarClientes();
	
	public static List<Cliente> generarClientes(){
		Cliente cl1 = new Cliente();
		cl1.setId(1L);
		cl1.setNombre("Jhon");
		cl1.setApellido("Murillo");
		
		Cliente cl2 = new Cliente();
		cl2.setId(2L);
		cl2.setNombre("Andres");
		cl2.setApellido("Agudelo");
		
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(cl1);
		clientes.add(cl2);
		
		return clientes;
		
	}

}
