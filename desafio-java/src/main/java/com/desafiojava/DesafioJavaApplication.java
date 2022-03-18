package com.desafiojava;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.LongStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.desafiojava.entities.Aluno;
import com.desafiojava.entities.Turma;
import com.desafiojava.repositories.AlunoRepo;

@SpringBootApplication
public class DesafioJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioJavaApplication.class, args);
	}
	
//	@Bean
//	CommandLineRunner init(AlunoRepo repository) {
////		ArrayList<Turma> turmas = new ArrayList<Turma>();
////		Turma turma1 = new Turma();
////		turma1.setNome("Turma de Informatica");
////		turma1.setCapacidade(10);
////		
////		Turma turma2 = new Turma();
////		turma2.setNome("Turma de Matematica");
////		turma2.setCapacidade(5);
////		
////		turmas.add(turma1);
////		turmas.add(turma2);
//		
//		return args -> {
//			repository.deleteAll();
//			LongStream.rangeClosed(1, 11)
//					.mapToObj(i -> {
//						Aluno a = new Aluno();
//						a.setNome("Rodrigo Valença");
//						a.setDataDeNascimento(LocalDate.parse("2017-11-15"));
//						//a.setTurmas(turmas);
//						return a;
//					}).map(v -> repository.save(v))
//							.forEach(System.out::println);
//		};
//		
//	}

}
