package com.desafiojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafiojava.entities.Aluno;

public interface AlunoRepo extends JpaRepository<Aluno, Integer>{

}
