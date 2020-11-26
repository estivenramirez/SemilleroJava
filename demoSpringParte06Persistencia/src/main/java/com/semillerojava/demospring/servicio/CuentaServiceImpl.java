package com.semillerojava.demospring.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semillerojava.demospring.model.Cuenta;
import com.semillerojava.demospring.repository.CuentaRepository;

@Service
public class CuentaServiceImpl implements CuentaService {

	private CuentaRepository cuentaRepository;
	
	@Autowired
	public CuentaServiceImpl(CuentaRepository cuentaRepository) {
		this.cuentaRepository = cuentaRepository;
	}
	
	@Override
	public List<Cuenta> listar() {
		return cuentaRepository.findAll();
	}

}
