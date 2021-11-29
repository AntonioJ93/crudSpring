package com.example.demo.modelo.service;

import java.util.List;

import com.example.demo.modelo.entity.Ciudad;

public interface ICiudadService {
	
	public List<Ciudad> listarCiudades();
	
	public void crearCiudad(Ciudad ciudad);
	
	public Ciudad buscarPorId(Long id);
	
	public void eliminar(Long id);

}
