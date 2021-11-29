package com.example.demo.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.entity.Ciudad;
import com.example.demo.modelo.repository.CiudadRepository;

@Service
public class CiudadServiceImpl implements ICiudadService{

	@Autowired
	private CiudadRepository repository;
	
	@Override
	public List<Ciudad> listarCiudades() {
		
		return (List<Ciudad>) repository.findAll();
	}

	@Override
	public void crearCiudad(Ciudad ciudad) {
		repository.save(ciudad);
		
	}

	@Override
	public Ciudad buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		repository.deleteById(id);
		
	}

}
