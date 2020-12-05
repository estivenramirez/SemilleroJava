package com.semillerojava.demospringboot.demoSpringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semillerojava.demospringboot.demoSpringboot.model.Cuenta;
import com.semillerojava.demospringboot.demoSpringboot.repository.CuentaRepository;

@Service
public class CuentaServiceImpl implements CuentaService{
	private CuentaRepository cuentaRepository;
	
	@Autowired
	public CuentaServiceImpl(CuentaRepository cuentaRepository) {
		this.cuentaRepository = cuentaRepository;
	}
	
	@Override
	public List<Cuenta> listar() {
		return cuentaRepository.findAll();
	}

	@Override
	public Cuenta crear(Cuenta cuenta) {
		return cuentaRepository.save(cuenta);
	}
}
