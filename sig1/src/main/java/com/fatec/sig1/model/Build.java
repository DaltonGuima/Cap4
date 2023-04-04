package com.fatec.sig1.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Build {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(message = "Modelo é requerido")
    private float Orcamento;
    @NotBlank(message = "Preço é requerido")
    private String Descricao;
    @NotEmpty(message = "Loja é requerido")
    private ItemBuild[] loja;

    
}
