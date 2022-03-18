package com.desafiojava.entities;

import java.io.Serializable;
import java.util.List;

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
@Entity(name = "tb_escolas")
public class Escola implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int Id;
	
	@Column(nullable = false, length = 70)
	public String Nome;
	
	@OneToOne
	@JoinColumn(name = "fk_endereco")
	public Endereco Endereco;

	@OneToMany(mappedBy = "aluno")	
	private List<Turma> turmas;
	
	public Escola() {}

	public Escola(int id, String nome, com.desafiojava.entities.Endereco endereco) {
		this.Id = id;
		Nome = nome;
		Endereco = endereco;
	}	
	

}
