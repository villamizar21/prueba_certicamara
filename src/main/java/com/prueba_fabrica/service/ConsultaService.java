package com.prueba_fabrica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prueba_fabrica.DTO.ResponseDto;
import com.prueba_fabrica.model.ContadorConsultas;
import com.prueba_fabrica.repository.RepositoryConsultas;

@Service
public class ConsultaService {

    @Autowired
    private RepositoryConsultas consul;


    private final String URL = "https://xkcd.com/info.0.json";


    public ResponseDto consultar() {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ResponseDto> response = restTemplate.getForEntity(URL, ResponseDto.class);
        try {
            List<ContadorConsultas> list = consul.findAll();
            if (list.isEmpty()) {
                ContadorConsultas init = new ContadorConsultas(1, 1);
            } else {
                ContadorConsultas contador = list.get(0);
                contador.setNumConsulta(contador.getNumConsulta() + 1);
                consul.save(contador);
                response.getBody().setnumConsulta(contador.getNumConsulta());
            }

        } catch (Exception e) {
           throw new IllegalArgumentException();
        }
        return response.getBody();
    }
}
