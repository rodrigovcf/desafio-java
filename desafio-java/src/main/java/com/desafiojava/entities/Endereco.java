package com.desafiojava.entities;

import java.io.Serializable;

import javax.persistence.*;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/*
 * Apesar de omitidos no diagrama de classes, 
 * foram criados os getters e setters mesmo com
 * indicação de atributos publics (+) 
 */
@Getter
@Setter
@EqualsAndHashCode
@Entity(name = "tb_enderecos")
public class Endereco implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(nullable = false, length = 70)
	public String logradouro;
	
	@Column(nullable = false, length = 70)
	public String complemento;
	
	@Column(nullable = false, length = 70)
	public String bairro;
	
	@Column(nullable = false, length = 70)
	public String cidade;
	
	@Column(nullable = false, length = 70)
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
	
	

}
