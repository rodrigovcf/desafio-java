package com.desafiojava.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

/*
 * Apesar de omitidos no diagrama de classes, 
 * foram criados os getters e setters mesmo com
 * indicação de atributos publics (+) 
 */
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
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getCapacidade() {
		return Capacidade;
	}

	public void setCapacidade(int capacidade) {
		Capacidade = capacidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Capacidade, Id, Nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Turma other = (Turma) obj;
		return Capacidade == other.Capacidade && Id == other.Id && Objects.equals(Nome, other.Nome);
	}
	 
	

}
