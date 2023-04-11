package com.fatec.sig1.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Id;

@Entity
public class Build {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(message = "Modelo é requerido")
    private float Orcamento;
    @NotBlank(message = "Preço é requerido")
    private String Descricao;
    public Build() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public Build(Long id, @NotNull(message = "Modelo é requerido") float orcamento,
            @NotBlank(message = "Preço é requerido") String descricao) {
        this.id = id;
        Orcamento = orcamento;
        Descricao = descricao;
    }

    

    
}
