package com.senaidev.cadastroCliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.cadastroCliente.entities.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {

}