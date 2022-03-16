package com.desafiojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafiojava.entities.Aluno;

@Repository
public interface AlunoRepo extends JpaRepository<Aluno, Integer>{

}
