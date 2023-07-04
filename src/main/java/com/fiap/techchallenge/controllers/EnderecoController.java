package com.fiap.techchallenge.controllers;

import com.fiap.techchallenge.dtos.EnderecoDTO;
import com.fiap.techchallenge.services.EnderecoService;
import jakarta.validation.Valid;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    private static final Logger LOGGER = LogManager.getLogger(EnderecoController.class);

    @PostMapping
    public ResponseEntity<EnderecoDTO> cadastro(@Valid @RequestBody EnderecoDTO enderecoDTO) {
        LOGGER.info("Inicio da requisição");
        try {
            EnderecoDTO enderecoGravado = enderecoService.cadastrarEndereco(enderecoDTO);
            LOGGER.info("Fim da requisição");
            return ResponseEntity.status(HttpStatus.CREATED).body(enderecoGravado);
        } catch (Exception e) {
            LOGGER.error("Erro durante o cadastro do endereço: {}", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
