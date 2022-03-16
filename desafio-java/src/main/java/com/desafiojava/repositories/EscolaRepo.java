package com.desafiojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafiojava.entities.Escola;

@Repository
public interface EscolaRepo extends JpaRepository<Escola, Integer>{

}
