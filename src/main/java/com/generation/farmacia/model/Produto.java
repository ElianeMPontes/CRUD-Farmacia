package com.generation.farmacia.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@NotBlank(message = "O atributo nome é Obrigatório!") 
	@Size(min = 1, max = 100, message = "O atributo nome deve conter no mínimo 01 e no máximo 100 caracteres")
	private String nome;
	
	@NotBlank(message = "O atributo descrição é Obrigatório!") 
	@Size(min = 1, max = 100, message = "O atributo nome deve conter no mínimo 01 e no máximo 100 caracteres")
	private String descricao;
	
	private float preco;
	
	@NotNull
    private LocalDate dataValidade; 
	
	
	@ManyToOne// classe produtos muitos: classe  categoria um
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;// adicionando o objeto categoria (id, descrição)


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public LocalDate getDataValidade() {
		return dataValidade;
	}


	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
}
