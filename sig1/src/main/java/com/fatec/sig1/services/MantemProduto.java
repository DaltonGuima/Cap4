package com.fatec.sig1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.fatec.sig1.model.Produto.Produto;
import com.fatec.sig1.model.Repositorys.MantemProdutoRepository;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class MantemProduto {
    Logger logger = LogManager.getLogger(this.getClass());
    @Autowired
    MantemProdutoRepository repository;

    public List<Produto> consultaTodos() {
        logger.info(">>>>>> servico consultaTodos chamado");
        return repository.findAll();
    }
}