package br.com.bibliotecasenai.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bibliotecasenai.principal.entities.Editora;
import br.com.bibliotecasenai.repositories.EditoraRepositorie;

@Service
public class EditoraService {
	// ATRIBUTOS
	@Autowired
	private EditoraRepositorie editoraRepositorie;

	// MÉTODO

	public Editora saveEditora(Editora editora) {
		return editoraRepositorie.save(editora);
	}

	public List<Editora> getAllEditora() {
		return editoraRepositorie.findAll();
	}

	public Editora getEditoraById(Long id) {
		return editoraRepositorie.findById(id).orElse(null);
	}

	public void deleteEditora(Long id) {
		editoraRepositorie.deleteById(id);
	}
}
