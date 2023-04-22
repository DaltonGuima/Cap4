package com.fatec.sig1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Id;

@Entity
public class Build {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "Nome é requerido")
    private String Nome;
    @NotNull(message = "Preço é requerido")
    private float Orcamento;
    @NotBlank(message = "Descrição é requerida")
    private String Descricao;

    public Build() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public float getOrcamento() {
        return Orcamento;
    }

    public void setOrcamento(float orcamento) {
        Orcamento = orcamento;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public Build(@NotNull(message = "Modelo é requerido") float orcamento,
            @NotBlank(message = "Preço é requerido") String descricao,
            @NotBlank(message = "Nome é requerido") String nome) {
        Orcamento = orcamento;
        Descricao = descricao;
        Nome = nome;
        
    }

}
