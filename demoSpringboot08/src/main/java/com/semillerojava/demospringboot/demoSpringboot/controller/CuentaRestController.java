package com.semillerojava.demospringboot.demoSpringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semillerojava.demospringboot.demoSpringboot.model.Cuenta;
import com.semillerojava.demospringboot.demoSpringboot.service.CuentaService;


@RestController
@RequestMapping("/v1/cuenta")
public class CuentaRestController {
	@Autowired
	private CuentaService cuentaService;
	
	@GetMapping
	public List<Cuenta> obtenerCuentas(){
		return cuentaService.listar();
	}
	
	@PostMapping
	public ResponseEntity<Cuenta> crear(@RequestBody Cuenta cuenta){
		Cuenta cuentaSaved = cuentaService.crear(cuenta);
		return new ResponseEntity<Cuenta>(cuentaSaved, HttpStatus.CREATED);
	}
}
