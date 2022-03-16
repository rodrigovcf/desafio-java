package com.desafiojava.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafiojava.entities.Aluno;
import com.desafiojava.repositories.AlunoRepo;

@RestController
@RequestMapping("/api")
public class AlunoController {
	
	@Autowired
	private AlunoRepo alunoRepository ;
	
	@GetMapping("todos")
	public List<Aluno> GetAll(){
		return alunoRepository.findAll();
	}
	
//	@GetMapping(value = "/{id}")
//	public Aluno findById(@PathVariable int id) {
//		return alunoRepository.findById(id);
//	}
//	
}
