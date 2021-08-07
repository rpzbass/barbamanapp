package com.agendamento.barbaman.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.agendamento.barbaman.enums.Situacao;

@Entity
@Table(name = "tb_agenda")
public class Agenda implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "id")
	private Long id;
	
	private Instant horario;
	private Situacao situacao;
	
	@ManyToOne
	@JoinColumn(name = "profissional_id")
	private Profissional profissional;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

	@Override
	public String toString() {
		return "Agenda [id=" + id + ", horario=" + horario + ", situacao=" + situacao + ", profissional=" + profissional.getId()
				+ "]";
	}

	public Agenda() {
		
	}
	
	public Agenda(Long id,Instant horario,Situacao situacao,Profissional profissional) {
			
			this.id = id;
			this.horario = horario;
			this.situacao = situacao;
			this.setProfissional(profissional);
	}

	public Instant getHorario() {
		return horario;
	}

	public void setHorario(Instant horario) {
		this.horario = horario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((horario == null) ? 0 : horario.hashCode());
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
		Agenda other = (Agenda) obj;
		if (horario == null) {
			if (other.horario != null)
				return false;
		} else if (!horario.equals(other.horario))
			return false;
		return true;
	}
	
	
	
	
	
}
