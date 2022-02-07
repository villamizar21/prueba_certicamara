package com.prueba_fabrica.service;

import com.prueba_fabrica.DTO.InputDTO;
import com.prueba_fabrica.DTO.OutputDTO;
import com.prueba_fabrica.DTO.ResponseDto;
import com.prueba_fabrica.model.ContadorConsultas;
import com.prueba_fabrica.repository.RepositoryConsultas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ConsultaService {

    @Autowired
    private RepositoryConsultas consul;


    public ResponseDto consultar() {

        RestTemplate restTemplate = new RestTemplate();
        String URL = "https://xkcd.com/info.0.json";
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

    public OutputDTO inputOutput(@RequestBody InputDTO entrada) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String URLpost = "http://API.SHOUTCLOUD.IO/V1/SHOUT";

            HttpEntity<InputDTO> request = new HttpEntity<>(entrada);

            ResponseEntity<OutputDTO> response = restTemplate
                    .exchange(URLpost, HttpMethod.POST, request, OutputDTO.class);
            System.out.println(response.getBody());

            return response.getBody();

        }catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
