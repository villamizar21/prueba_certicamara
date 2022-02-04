package com.prueba_fabrica.service;

import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prueba_fabrica.DTO.ResponseDto;
import com.prueba_fabrica.repository.Repository;
import com.prueba_fabrica.repository.RepositoryConsultas;

@Service
public class ConsultaService {

	@Autowired
	private Repository repo;

	@Autowired
	private RepositoryConsultas consul;
	
	private final String URL = "https://xkcd.com/info.0.json";

	public ResponseDto consultar() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<ResponseDto> response = restTemplate.getForEntity(URL, ResponseDto.class);
		return response.getBody();
	}
}
