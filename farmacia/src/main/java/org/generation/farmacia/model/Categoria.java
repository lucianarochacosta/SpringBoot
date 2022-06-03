package org.generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String categoria;
	
	private String subcategoria;
	
	private Boolean prescricaoControlada;
	
	private String localizacao_loja;
	
	private Boolean em_estoque;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}

	public Boolean getPrescricaoControlada() {
		return prescricaoControlada;
	}

	public void setPrescricaoControlada(Boolean prescricaoControlada) {
		this.prescricaoControlada = prescricaoControlada;
	}

	public String getLocalizacao_loja() {
		return localizacao_loja;
	}

	public void setLocalizacao_loja(String localizacao_loja) {
		this.localizacao_loja = localizacao_loja;
	}

	public Boolean getEm_estoque() {
		return em_estoque;
	}

	public void setEm_estoque(Boolean em_estoque) {
		this.em_estoque = em_estoque;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

}
