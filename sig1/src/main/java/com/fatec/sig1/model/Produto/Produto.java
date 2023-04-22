package com.fatec.sig1.model.Produto;

import java.util.*;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "Nome é requerido")
    private String nome;
    @NotBlank(message = "Fabricante é requerido")
    private String fabricante;
    @NotBlank(message = "Modelo é requerido")
    private String modelo;
    @NotNull(message = "Preco é requerido")
    private float preco;
    @NotBlank(message = "Vendedor é requerido")
    private String vendedor;
    @NotBlank(message = "Link do Produto é requerido")
    private String linkProduto;
    @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])[\\/-](0?[1-9]|1[012])[\\/-]\\d{4}$", message = "A data de nascimento deve estar no formato dd/MM/YYYY")
    private String dataCadastro;
    @NotEmpty
    private Map<String, String> especificacoes = new HashMap<String, String>();

    public Produto() {
    }

    public Produto(String nome, String fabricante, String modelo, float preco,
            String vendedor, String linkProduto) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.preco = preco;
        this.vendedor = vendedor;
        this.linkProduto = linkProduto;
        setDataCadastro(new DateTime());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getLinkProduto() {
        return linkProduto;
    }

    public void setLinkProduto(String linkProduto) {
        this.linkProduto = linkProduto;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(DateTime dataAtual) {
        this.dataCadastro = obtemDataAtual(dataAtual);
    }

    public String obtemDataAtual(DateTime dataAtual) {
        DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/MM/YYYY");
        return dataAtual.toString(fmt);
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Map getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(Map especificacoes) {
        this.especificacoes = especificacoes;
    }

}
