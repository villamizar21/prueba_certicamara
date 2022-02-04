package com.prueba_fabrica.controller;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.prueba_fabrica.DTO.ResponseDto;
import com.prueba_fabrica.service.ConsultaService;

@RestController
public class Controller {

	@Autowired
	private ConsultaService consulta;

	@GetMapping
	public ResponseDto listar() {
		return consulta.consultar();
	}
}
