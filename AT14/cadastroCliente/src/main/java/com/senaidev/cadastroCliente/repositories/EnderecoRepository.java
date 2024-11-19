package com.senaidev.cadastroCliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.cadastroCliente.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}