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
	public String Nome;
	public int Capacidade;
	
	public Turma() {}

	public Turma(int id, String nome, int capacidade) {		
		Id = id;
		Nome = nome;
		Capacidade = capacidade;
	}
		
}
