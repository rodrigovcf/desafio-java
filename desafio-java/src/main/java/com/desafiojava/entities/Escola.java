package com.desafiojava.entities;

import java.io.Serializable;
import java.util.Objects;

public class Escola implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public int Id;
	public String Nome;
	public Endereco Endereco;

	public Escola() {}

	public Escola(int id, String nome, com.desafiojava.entities.Endereco endereco) {
		this.Id = id;
		Nome = nome;
		Endereco = endereco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Endereco, Nome, Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Escola other = (Escola) obj;
		return Objects.equals(Endereco, other.Endereco) && Objects.equals(Nome, other.Nome) && Id == other.Id;
	}
		

}
