package com.agendamento.barbaman.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Profissional implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String celular;
	
	private Set<Especialidade> especialidades = new HashSet<>();
	
	
	public Profissional() {
		
	}
	
	public Profissional(Long id,String nome,String celular) {
		
		this.id = id;
		this.nome = nome;
		this.celular = celular;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Set<Especialidade> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(Set<Especialidade> especialidades) {
		this.especialidades = especialidades;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profissional other = (Profissional) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
}
