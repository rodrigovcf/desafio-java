package com.desafiojava.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafiojava.entities.Aluno;
import com.desafiojava.repositories.AlunoRepo;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoRepo alunoRepository ;
	
	@PostMapping
	public Aluno create(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> getById(@PathVariable int id) {
		return alunoRepository.findById(id)
				.map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/todos")
	public List<Aluno> getAll(){
		return alunoRepository.findAll();
	}
		
	@PutMapping(value = "/{id}")
	public ResponseEntity<?> update(@PathVariable("id") int id, 
									@RequestBody Aluno aluno) {
		return alunoRepository.findById(id)
				.map(record -> {
					record.setNome(aluno.getNome());
					record.setDataDeNascimento(aluno.getDataDeNascimento());
					record.setTurmas(aluno.getTurmas());
					
					Aluno update = alunoRepository.save(record);
					return ResponseEntity.ok().body(update);
					
				}).orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/remover/{id}")
	public void remove(@PathVariable int id) {
		alunoRepository.deleteById(id);
	}
	
	
	
	
}
