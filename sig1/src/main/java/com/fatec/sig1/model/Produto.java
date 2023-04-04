package com.fatec.sig1.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "Modelo é requerido")
    private String modelo;
    @NotBlank(message = "Preço é requerido")
    private String preco;
    @NotBlank(message = "Loja é requerido")
    private String loja;
    @NotBlank(message = "É obrigatório a inserção dos Detalhes do produto.")
    private String detalhes;
    @NotBlank(message = "O Status é obrigatório.")
    private String status;

    public Produto(String modelo, String preco, String loja, String detalhes, String status) {
        this.modelo = modelo;
        this.preco = preco;
        this.loja = loja;
        this.detalhes = detalhes;
        this.status = status;
    }

    public Produto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}