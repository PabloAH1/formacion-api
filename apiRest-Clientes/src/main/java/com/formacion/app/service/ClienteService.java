package com.formacion.app.service;

import java.util.List;

import com.formacion.app.entity.Cliente;
import com.formacion.app.entity.Region;

public interface ClienteService {

	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
		
	public void delete(Long id);
	
	public List<Region> findAllRegiones();
}
