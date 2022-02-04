package com.prueba_fabrica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba_fabrica.model.DatosXkcd;

public interface Repository extends JpaRepository<DatosXkcd, Integer> {

}
