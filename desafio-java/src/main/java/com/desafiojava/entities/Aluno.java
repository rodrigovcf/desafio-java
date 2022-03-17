package com.desafiojava.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

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
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	public LocalDateTime DataDeNascimento;
	
	@OneToMany(mappedBy = "aluno")	
	private List<Turma> turmas;
	
	public Aluno() {}

	public Aluno(int id, String nome, LocalDateTime dataDeNascimento) {		
		this.Id = id;
		Nome = nome;
		DataDeNascimento = dataDeNascimento;
	}
	
}
