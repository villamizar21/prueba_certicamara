package com.prueba_fabrica.controller;

import com.prueba_fabrica.DTO.InputDTO;
import com.prueba_fabrica.DTO.OutputDTO;
import com.prueba_fabrica.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.prueba_fabrica.DTO.ResponseDto;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

	@Autowired
	private ConsultaService consulta;

	private final String URLpost = "http://API.SHOUTCLOUD.IO/V1/SHOUT";

	@GetMapping
	public ResponseDto listar() {
		return consulta.consultar();
	}

	@PostMapping(path = "/shout", produces="application/json")
	public OutputDTO inputOutput(@RequestBody InputDTO entrada) {
		RestTemplate restTemplate = new RestTemplate();

		HttpEntity<OutputDTO> request = new HttpEntity<>(new OutputDTO(entrada.getINPUT(), entrada.getINPUT()));

		ResponseEntity<OutputDTO> response = restTemplate
				.exchange(URLpost, HttpMethod.POST, request, OutputDTO.class);
		System.out.println(response.getBody());

		return request.getBody();
	}
}
