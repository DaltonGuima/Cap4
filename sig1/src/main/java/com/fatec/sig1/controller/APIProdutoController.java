package com.fatec.sig1.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.sig1.model.Produto.Produto;
import com.fatec.sig1.services.MantemProduto;

@RestController
@RequestMapping("/api/v1/produtos")

public class APIProdutoController {
    @Autowired
    MantemProduto mantemProduto;
    Produto produto;
    Logger logger = LogManager.getLogger(this.getClass());

    @CrossOrigin // desabilita o cors do spring security
    @GetMapping
    public ResponseEntity<List<Produto>> consultaTodos() {
        return ResponseEntity.status(HttpStatus.OK).body(mantemProduto.consultaTodos());
    }

}
