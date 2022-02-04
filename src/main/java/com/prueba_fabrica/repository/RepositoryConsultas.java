package com.prueba_fabrica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba_fabrica.model.ContadorConsultas;

public interface RepositoryConsultas extends JpaRepository<ContadorConsultas, Integer> {

}
