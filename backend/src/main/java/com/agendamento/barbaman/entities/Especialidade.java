package com.agendamento.barbaman.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.agendamento.barbaman.enums.Possui;

@Entity
@Table(name = "tb_especialidade")
public class Especialidade implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private Long id;
	
	private String nome;
	private Double valor;
	private String descricao;
	private Possui possui;
	
	public Especialidade() {
		
	}
	public Especialidade(Long id,String nome,Double valor, String descricao, Possui possui) {
		
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.descricao = descricao;
		this.possui = possui;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Especialidade [id=" + id + ", nome=" + nome + ", valor=" + valor + ", descricao=" + descricao
				+ ", possui=" + possui + "]";
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
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
		Especialidade other = (Especialidade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
}
