package br.com.bibliotecasenai.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bibliotecasenai.Services.EditoraService;
import br.com.bibliotecasenai.principal.entities.Editora;

@RestController
@RequestMapping("/editora")
public class EditoraControllers {

	// ATRIBUTOS
	@Autowired
	private EditoraService editoraService;

	// MÉTODO
	@PostMapping
	public Editora createEtidora(@RequestBody Editora editora) {
		return editoraService.saveEditora(editora);
	}

	@GetMapping
	public List<Editora> getAllEditora() {
		return editoraService.getAllEditora();
	}

	@GetMapping("/{id}")
	public Editora getEditora(@PathVariable Long id) {
		return editoraService.getEditoraById(id);

	}

	@DeleteMapping("/{id}")
	public void deleteEditora(@PathVariable Long id) {
		editoraService.deleteEditora(id);
	}
}