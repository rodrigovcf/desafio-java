package com.desafiojava.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * Apesar de omitidos no diagrama de classes, 
 * foram criados os getters e setters mesmo com
 * indicação de atributos publics (+) 
 */
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

	public LocalDateTime getDataDeNascimento() {
		return DataDeNascimento;
	}

	public void setDataDeNascimento(LocalDateTime dataDeNascimento) {
		DataDeNascimento = dataDeNascimento;
	}		

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
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
