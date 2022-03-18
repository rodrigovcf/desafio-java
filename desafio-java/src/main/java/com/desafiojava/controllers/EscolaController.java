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

import com.desafiojava.entities.Escola;
import com.desafiojava.repositories.EscolaRepo;

@RestController
@RequestMapping("/escolas")
public class EscolaController {
	
	@Autowired
	private EscolaRepo escolaRepository ;
	
	@PostMapping
	public Escola create(@RequestBody Escola escola) {
		return escolaRepository.save(escola);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> getById(@PathVariable int id) {
		return escolaRepository.findById(id)
				.map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/todos")
	public List<Escola> getAll(){
		return escolaRepository.findAll();
	}
		
	@PutMapping(value = "/{id}")
	public ResponseEntity<?> update(@PathVariable("id") int id, 
									@RequestBody Escola escola) {
		return escolaRepository.findById(id)
				.map(record -> {					
					record.setNome(escola.getNome());
					record.setEndereco(escola.getEndereco());
					
					Escola update = escolaRepository.save(record);
					return ResponseEntity.ok().body(update);
					
				}).orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/remover/{id}")
	public void remove(@PathVariable int id) {
		escolaRepository.deleteById(id);
	}
	
	
	
	
}
