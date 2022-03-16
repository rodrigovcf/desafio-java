package com.desafiojava.entities;

import java.io.Serializable;
import java.util.Objects;

/*
 * Não utilizados os getters e setters, pois não estavam no Diagrama
 */
public class Turma implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public int Id;
	public String Nome;
	public int Capacidade;
	
	public Turma() {}

	public Turma(int id, String nome, int capacidade) {
		super();
		Id = id;
		Nome = nome;
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
