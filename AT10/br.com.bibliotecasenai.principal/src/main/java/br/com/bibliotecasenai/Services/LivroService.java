package br.com.bibliotecasenai.Services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.bibliotecasenai.principal.entities.Livro;
import br.com.bibliotecasenai.repositories.LivroRepositorie;
	
	@Service
	public class LivroService{
		//ATRIBUTOS
		@Autowired
		private LivroRepositorie livroRepositorie;
		
		//MÉTODO
		
		public Livro saveLivro (Livro livro) {
		return livroRepositorie.save(livro);
}
		public List <Livro> getAllLivro(){
			return livroRepositorie.findAll();
		}
		
		public Livro getLivroById(Long id) {
			return livroRepositorie.findById(id).orElse(null);
		}
		
		public void deleteLivro(Long id) {
			livroRepositorie.deleteById(id);
		}

		
}
