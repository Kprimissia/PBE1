package br.com.bibliotecasenai.principal.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "tb_editora")
public class Editora {

	// ARTIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	
	private Long id_editora;
	
	@Column(name = "nome")
	private String nome_editora;
	
	@Column(name = "cnpj")
	private String cnpj;
	
	@Column (name = "email")
	private String email;
	
	@Column (name = "contato")
	private String contato;

	// CONSTRUTORES
	public Editora() {

	}

	public Editora(Long id_editora, String nome_editora, String cnpj, String email, String contato) {
		this.id_editora = id_editora;
		this.nome_editora = nome_editora;
		this.cnpj = cnpj;
		this.email = email;
		this.contato = contato;
	}

	// GETEERS E SETEERS
	public Long getId_editora() {
		return id_editora;
	}

	public void setId_editora(Long id_editora) {
		this.id_editora = id_editora;
	}

	public String getNome_editora() {
		return nome_editora;
	}

	public void setNome_editora(String nome_editora) {
		this.nome_editora = nome_editora;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
}
