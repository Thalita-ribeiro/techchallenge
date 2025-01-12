package com.fiap.techchallenge.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiap.techchallenge.entities.Eletrodomestico;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class EletrodomesticoDTO {
    @JsonProperty
    private Long id;
    @JsonProperty
    @NotBlank(message = "Nome do Eletrodoméstico é um campo obrigatório e não pode estar em branco")
    private String nome;
    @JsonProperty
    @NotBlank(message = "Modelo do Eletrodoméstico é um campo obrigatório e não pode estar em branco")
    private String modelo;
    @JsonProperty
    @PositiveOrZero
    //@NotBlank(message = "Potência do Eletrodoméstico é um campo obrigatório e não pode estar em branco")
    private Double potencia;

    public EletrodomesticoDTO(Eletrodomestico eletrodomestico) {
        this.id = eletrodomestico.getId();
        this.nome = eletrodomestico.getNome();
        this.modelo = eletrodomestico.getModelo();
        this.potencia = eletrodomestico.getPotencia();
    }

    public Eletrodomestico toEntity() {
        return new Eletrodomestico(this.nome, this.modelo, this.potencia);
    }
}
