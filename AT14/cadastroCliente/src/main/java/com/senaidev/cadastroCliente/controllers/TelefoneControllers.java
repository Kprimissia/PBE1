package com.senaidev.cadastroCliente.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.cadastroCliente.entities.Telefone;
import com.senaidev.cadastroCliente.services.TelefoneService;

@RestController
@RequestMapping("/telefone")
public class TelefoneControllers {


	@Autowired
	private TelefoneService telefoneService;

	@PostMapping
	public Telefone createTelefone(@RequestBody Telefone telefone) {
		return telefoneService.saveTelefone(telefone);
	}

	@GetMapping
	public List<Telefone> getAllTelefone() {
		return telefoneService.getAllTelefone();
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Telefone> getTelefone(@PathVariable Long id) {
	Telefone telefone = telefoneService.getTelefoneById(id);
	if (telefone != null) {
	return ResponseEntity.ok(telefone);
	} else {
	return ResponseEntity.notFound().build();
	}
	}

	@DeleteMapping(value = "/{id}")
	public void deleteTelefone(@PathVariable Long id) {
		telefoneService.deleteTelefone(id);
	}
}