package com.agendamento.barbaman;

import java.time.Instant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.agendamento.barbaman.entities.Agenda;
import com.agendamento.barbaman.entities.Especialidade;
import com.agendamento.barbaman.entities.Profissional;
import com.agendamento.barbaman.enums.Possui;
import com.agendamento.barbaman.enums.Situacao;
import com.agendamento.barbaman.enums.Status;

@SpringBootApplication
public class BarbaManApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarbaManApplication.class, args);
		
		/*
		Profissional profissional = new Profissional(1L,"Eduard","419999999",Status.DISPONIVEL);
		
		profissional.getEspecialidades().add(new Especialidade(1L,"Corte",20.0,"Corte de cabelo",Possui.SIM));
		profissional.getEspecialidades().add(new Especialidade(2L,"Barba",20.0,"Aparamento da barba",Possui.SIM));
		profissional.getHorarios().add(new Agenda(1L,Instant.now(),Situacao.LIBERADO,profissional));
		
		System.out.println(profissional);
		*/
	}

}
