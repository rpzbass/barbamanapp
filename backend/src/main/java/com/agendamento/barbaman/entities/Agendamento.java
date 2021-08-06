package com.agendamento.barbaman.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Agendamento implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private Set<ItemAgendamento> agendamentos = new HashSet<>();
	private Usuario usuario;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Set<ItemAgendamento> getAgendamentos() {
		return agendamentos;
	}
	
	public void setAgendamentos(Set<ItemAgendamento> agendamentos) {
		this.agendamentos = agendamentos;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	
	
}
