package com.agendamento.barbaman.entities;

import java.io.Serializable;
import java.time.Instant;

public class ItemAgendamento implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Instant horario;
	private Instant data;
	private Double valorTotal;
	
	private Profissional profissional;
	
	public ItemAgendamento() {
		
	}
	
	public ItemAgendamento(Long id, Instant horario,Instant data,Double valorTotal) {
		
		this.id = id;
		this.horario = horario;
		this.data = data;
		this.valorTotal = valorTotal;
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getHorario() {
		return horario;
	}

	public void setHorario(Instant horario) {
		this.horario = horario;
	}

	public Instant getData() {
		return data;
	}

	public void setData(Instant data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
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
		ItemAgendamento other = (ItemAgendamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
}
