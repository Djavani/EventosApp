package com.eventoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventoapp.model.Convidado;
import com.eventoapp.model.Evento;

public interface ConvidadoRepository extends JpaRepository<Convidado, String> {
	
	Iterable<Convidado> findByEvento(Evento evento);
	
	Convidado findByRg(String rg);

}
