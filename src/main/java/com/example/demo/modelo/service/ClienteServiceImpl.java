package com.example.demo.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.entity.Cliente;
import com.example.demo.modelo.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private ClienteRepository repository;
	
	@Override
	public List<Cliente> listarClientes() {
		return (List<Cliente>) repository.findAll();
	}

	@Override
	public void crearCliente(Cliente cliente) {
		repository.save(cliente);
	}

	@Override
	public Cliente buscarPorId(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		repository.deleteById(id);
	}

}
