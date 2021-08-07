package com.agendamento.barbaman.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.agendamento.barbaman.enums.Status;

@Entity
@Table(name = "tb_profissional")
public class Profissional implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String celular;
	private Status status;

	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_profissional_especialidade", joinColumns = @JoinColumn(name = "profissional_id"), inverseJoinColumns = @JoinColumn(name = "especialidade_id"))
	private Set<Especialidade> especialidades = new HashSet<>();

	
	@OneToMany(mappedBy = "profissional")
	private Set<Agenda> horarios = new HashSet<>();

	public Set<Agenda> getHorarios() {
		return horarios;
	}

	@Override
	public String toString() {
		return "Profissional [id=" + id + ", nome=" + nome + ", celular=" + celular + ", status=" + status
				+ ", especialidades=" + especialidades + ", horarios=" + horarios + "]";
	}

	public void setHorarios(Set<Agenda> horarios) {
		this.horarios = horarios;
	}

	public Profissional() {

	}

	public Profissional(Long id, String nome, String celular, Status status) {

		this.id = id;
		this.nome = nome;
		this.celular = celular;
		this.status = status;

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
