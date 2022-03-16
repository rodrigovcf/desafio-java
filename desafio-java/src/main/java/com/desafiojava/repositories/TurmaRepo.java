package com.desafiojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafiojava.entities.Turma;

@Repository
public interface TurmaRepo extends JpaRepository<Turma, Integer>{

}
