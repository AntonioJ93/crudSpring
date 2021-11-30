package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.entity.Ciudad;
import com.example.demo.modelo.entity.Cliente;
import com.example.demo.modelo.service.ICiudadService;
import com.example.demo.modelo.service.IClienteService;

@Controller
@RequestMapping("/views/clientes")
public class ClienteController {

	@Autowired
	private IClienteService service;
	@Autowired
	private ICiudadService ciudadService;
	
	@GetMapping("/")
	public String listarClientes(Model model) {
		
		List<Cliente> lista=service.listarClientes();
		model.addAttribute("clientes", lista);
		model.addAttribute("titulo", "Lista de Clientes");
		return "/views/clientes/listar";
	}
	
	@GetMapping("/crear")
	public String crear(Model model) {
		Cliente cliente=new Cliente();
		List<Ciudad> ciudades=ciudadService.listarCiudades();
		model.addAttribute("ciudades", ciudades);
		model.addAttribute("cliente", cliente);
		model.addAttribute("titulo", "Crear Cliente");
		return "/views/clientes/formCrear";
	}
	
	@PostMapping("/guardar")
	public String guardarCliente(@ModelAttribute("cliente") Cliente cliente) {
		System.out.println(cliente);
		service.crearCliente(cliente);
		return "/views/clientes/listar";
	}
}
