package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.models.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Carlos Vinicios", "123.456.789-00");
	}
	
	//passando parametro via URL
	@GetMapping("/{id}")
	public Cliente obterClientePorId(@PathVariable int id) {
		return new Cliente(id, "Carlos Vinicios", "123.456.789-00");
	}
	
	@GetMapping()
	public Cliente obterClientePorId2(@RequestParam(name = "id") int id) {
		return new Cliente(id, "Henderson", "321.453.879-00");
	}
	
}
