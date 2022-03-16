package com.desafiojava.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

/*
 * Apesar de omitidos no diagrama de classes, 
 * foram criados os getters e setters mesmo com
 * indicação de atributos publics (+) 
 */
@Entity(name = "tb_enderecos")
public class Endereco implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	public String logradouro;
	public String complemento;
	public String bairro;
	public String cidade;
	public String estado;	

	public Endereco(int id, String logradouro, String complemento, 
						String bairro, String cidade, String estado) {		
		this.id = id;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bairro, cidade, complemento, estado, logradouro);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cidade, other.cidade)
				&& Objects.equals(complemento, other.complemento) && Objects.equals(estado, other.estado)
				&& Objects.equals(logradouro, other.logradouro);
	}
	
	

}
