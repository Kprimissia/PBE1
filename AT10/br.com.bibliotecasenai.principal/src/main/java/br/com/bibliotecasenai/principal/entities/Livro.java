package br.com.bibliotecasenai.principal.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name= "tb_Livro")
public class Livro {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id_livro;
	
	@Column (name= "nome")
	private String nome_livro;
	
	@Column (name= "autor")
	private String nome_autor;
	
	@Column (name="isbn")
	private String isbn;
	
	@Column (name="ano")
	private int ano;
	
	@Column (name="valor")
	private double valor;
	
	@Column (name= "estoque")
	private int estoque;
	
	//CONSTRUTORES
	public Livro() {
		
	}
	public Livro(Long id_livro, String nome_livro, String nome_autor, String isbn, double valor, int estoque,int ano) {
		this.id_livro = id_livro;
		this.nome_livro = nome_livro;
		this.nome_autor = nome_autor;
		this.isbn = isbn;
		this.ano = ano;
		this.valor = valor;
		this.estoque = estoque;
	}
	
	//GETTERS E SETEERS
	public Long getId_livro() {
		return id_livro;
	}
	public void setId_livro(Long id_livro) {
		this.id_livro = id_livro;
	}
	public String getNome_livro() {
		return nome_livro;
	}
	public void setNome_livro(String nome_livro) {
		this.nome_livro = nome_livro;
	}
	public String getNome_autor() {
		return nome_autor;
	}
	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
}
