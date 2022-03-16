package com.desafiojava.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
@Entity(name = "tb_alunos")
public class Aluno implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int Id;
	
	public String Nome;
	
	@Temporal(TemporalType.DATE)
	public LocalDateTime DataDeNascimento;
	
	@OneToOne(mappedBy = "id.aluno")	
	private Turma turma;
	
	public Aluno() {}

	public Aluno(int id, String nome, LocalDateTime dataDeNascimento) {		
		this.Id = id;
		Nome = nome;
		DataDeNascimento = dataDeNascimento;
	}
	
}
