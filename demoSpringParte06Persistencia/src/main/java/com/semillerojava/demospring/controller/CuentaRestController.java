package com.semillerojava.demospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semillerojava.demospring.model.Cuenta;
import com.semillerojava.demospring.servicio.CuentaService;

@RestController
@RequestMapping("/v1/cuenta")
public class CuentaRestController {
	
	@Autowired
	private CuentaService cuentaService;
	
	@GetMapping
	public List<Cuenta> obtenerCuentas(){
		return cuentaService.listar();
	}
	
}
