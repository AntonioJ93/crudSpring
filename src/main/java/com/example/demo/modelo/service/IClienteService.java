package com.example.demo.modelo.service;

import java.util.List;

import com.example.demo.modelo.entity.Cliente;


public interface IClienteService {

	public List<Cliente> listarClientes();
	
	public void crearCliente(Cliente cliente);
	
	public Cliente buscarPorId(Long id);
	
	public void eliminar(Long id);
	
}
