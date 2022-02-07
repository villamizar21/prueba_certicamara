package com.prueba_fabrica.controller;

import com.prueba_fabrica.DTO.InputDTO;
import com.prueba_fabrica.DTO.OutputDTO;
import com.prueba_fabrica.DTO.ResponseDto;
import com.prueba_fabrica.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private ConsultaService consulta;

    @GetMapping
    public ResponseDto listar() {
        return consulta.consultar();
    }

    @PostMapping(path = "/shout", produces = "application/json")
    public OutputDTO inputOutput(@RequestBody InputDTO entrada) {
        return consulta.inputOutput(entrada);
    }
}
