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

import br.com.bibliotecasenai.Services.LivroService;
import br.com.bibliotecasenai.principal.entities.Livro;

	
	@RestController
	@RequestMapping("/livro")
	public class LivroController {
		
		
		//ATRIBUTOS
		@Autowired
		private LivroService livroService;
	
		//MÉTODO
		@PostMapping
		public Livro createLivro(@RequestBody Livro livro) {
			return livroService.saveLivro(livro);
		}
		
		
		@GetMapping
		public List<Livro> getAllLivro(){
			return livroService.getAllLivro();
		}
		
		@GetMapping("/{id}")
		public Livro getLivro(@PathVariable Long id){
			return livroService.getLivroById(id);
			
		}
		@DeleteMapping("/{id}")
		public void deleteLivro (@PathVariable Long id) {
			livroService.deleteLivro(id);
		}	

}

	
	


