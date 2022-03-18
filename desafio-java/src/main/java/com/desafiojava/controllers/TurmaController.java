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

import com.desafiojava.entities.Turma;
import com.desafiojava.repositories.TurmaRepo;

@RestController
@RequestMapping("/turmas")
public class TurmaController {
	
	@Autowired
	private TurmaRepo turmaRepository ;
	
	@PostMapping
	public Turma create(@RequestBody Turma endereco) {
		return turmaRepository.save(endereco);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> getById(@PathVariable int id) {
		return turmaRepository.findById(id)
				.map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/todos")
	public List<Turma> getAll(){
		return turmaRepository.findAll();
	}
		
	@PutMapping(value = "/{id}")
	public ResponseEntity<?> update(@PathVariable("id") int id, 
									@RequestBody Turma turma) {
		return turmaRepository.findById(id)
				.map(record -> {					
					record.setNome(turma.getNome());
					record.setCapacidade(turma.getCapacidade());
					
					Turma update = turmaRepository.save(record);
					return ResponseEntity.ok().body(update);
					
				}).orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/remover/{id}")
	public void remove(@PathVariable int id) {
		turmaRepository.deleteById(id);
	}
	
	
	
	
}
