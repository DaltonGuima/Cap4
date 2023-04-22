package com.fatec.sig1.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class BuildDTO {

    @NotBlank(message = "Nome é requerido")
    private String Nome;
    @NotNull(message = "Modelo é requerido")
    private float Orcamento;
    @NotBlank(message = "Preço é requerido")
    private String Descricao;

    public BuildDTO(String Nome, float Orcamento, String Descricao) {
        this.Nome = Nome;
        this.Orcamento = Orcamento;
        this.Descricao = Descricao;
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

    public Build retornaUmaBuild() {
        return new Build(Orcamento, Descricao, Nome);
    }

}