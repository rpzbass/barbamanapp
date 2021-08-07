package com.agendamento.barbaman.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agendamento.barbaman.entities.ItemAgendamento;

public interface ItemAgendamentoRepository extends JpaRepository<ItemAgendamento,Long> {

	
}
