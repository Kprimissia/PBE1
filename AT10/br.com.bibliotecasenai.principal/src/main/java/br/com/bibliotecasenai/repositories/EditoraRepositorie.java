package br.com.bibliotecasenai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bibliotecasenai.principal.entities.Editora;

public interface EditoraRepositorie extends JpaRepository<Editora,Long> {

}

