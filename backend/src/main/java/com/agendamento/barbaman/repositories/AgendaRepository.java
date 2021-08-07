package com.agendamento.barbaman.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agendamento.barbaman.entities.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda,Long> {

}
