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
@Entity(name = "tb_turmas")
public class Turma implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int Id;
	
	@Column(nullable = false, length = 70)
	public String Nome;
	
	@Column(nullable = false)
	public int Capacidade;
	
	@OneToOne
	@JoinColumn(name="aluno.id")
	private Aluno aluno;
	
	@OneToOne
	@JoinColumn(name="escola.id")
	private Escola escola;
	
	public Turma() {}

	public Turma(int id, String nome, int capacidade) {		
		Id = id;
		Nome = nome;
		Capacidade = capacidade;
	}
		
}
