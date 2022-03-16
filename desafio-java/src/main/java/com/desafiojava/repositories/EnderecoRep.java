package com.desafiojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafiojava.entities.Endereco;

@Repository
public interface EnderecoRep extends JpaRepository<Endereco, Integer>{

}
