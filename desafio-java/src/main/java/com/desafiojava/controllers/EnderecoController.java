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

import com.desafiojava.entities.Endereco;
import com.desafiojava.repositories.EnderecoRep;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
	
	@Autowired
	private EnderecoRep enderRepository ;
	
	@PostMapping
	public Endereco create(@RequestBody Endereco endereco) {
		return enderRepository.save(endereco);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> getById(@PathVariable int id) {
		return enderRepository.findById(id)
				.map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/todos")
	public List<Endereco> getAll(){
		return enderRepository.findAll();
	}
		
	@PutMapping(value = "/{id}")
	public ResponseEntity<?> update(@PathVariable("id") int id, 
									@RequestBody Endereco endereco) {
		return enderRepository.findById(id)
				.map(record -> {					
					record.setBairro(endereco.getBairro());
					record.setCidade(endereco.getCidade());
					record.setComplemento(endereco.getComplemento());
					record.setEstado(endereco.getEstado());
					record.setLogradouro(endereco.getLogradouro());
					
					Endereco update = enderRepository.save(record);
					return ResponseEntity.ok().body(update);
					
				}).orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/remover/{id}")
	public void remove(@PathVariable int id) {
		enderRepository.deleteById(id);
	}
	
	
	
	
}
