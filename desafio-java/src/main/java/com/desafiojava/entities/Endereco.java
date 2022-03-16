package com.desafiojava.entities;

import java.io.Serializable;
import java.util.Objects;

public class Endereco implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public String logradouro;
	public String complemento;
	public String bairro;
	public String cidade;
	public String estado;
	
	@Override
	public int hashCode() {
		return Objects.hash(bairro, cidade, complemento, estado, logradouro);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cidade, other.cidade)
				&& Objects.equals(complemento, other.complemento) && Objects.equals(estado, other.estado)
				&& Objects.equals(logradouro, other.logradouro);
	}
	
	

}
