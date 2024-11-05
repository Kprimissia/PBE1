package br.com.bibliotecasenai.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bibliotecasenai.principal.entities.Livro;

public interface LivroRepositorie extends JpaRepository<Livro,Long> {

}