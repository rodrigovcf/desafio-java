package com.desafiojava.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Aluno implements Serializable{

	private static final long serialVersionUID = 1L;
	public int Id;
	public String Nome;
	public LocalDateTime DataDeNascimento;
	
	public Aluno() {}

	public Aluno(int id, String nome, LocalDateTime dataDeNascimento) {		
		this.Id = id;
		Nome = nome;
		DataDeNascimento = dataDeNascimento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DataDeNascimento, Nome, Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(DataDeNascimento, other.DataDeNascimento) && Objects.equals(Nome, other.Nome)
				&& Id == other.Id;
	}
	
}
