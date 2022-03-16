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
@Entity(name = "tb_escolas")
public class Escola implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int Id;
	public String Nome;
	
	@OneToOne
	@JoinColumn(name = "fk_endereco")
	public Endereco Endereco;

	@OneToMany
	@JoinColumn(name = "fk_turma")
	private List<Turma> turmas;
	
	public Escola() {}

	public Escola(int id, String nome, com.desafiojava.entities.Endereco endereco) {
		this.Id = id;
		Nome = nome;
		Endereco = endereco;
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

	public Endereco getEndereco() {
		return Endereco;
	}

	public void setEndereco(Endereco endereco) {
		Endereco = endereco;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
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
