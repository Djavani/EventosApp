package com.eventoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventoapp.model.Convidado;

public interface ConvidadoRepository extends JpaRepository<Convidado, String> {

}
