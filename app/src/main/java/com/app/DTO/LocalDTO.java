package com.app.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LocalDTO {
    
    @Setter(AccessLevel.NONE)
    private Long id;
    private String cep;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private Integer numero;
    private String complemento;
    @JsonIgnore
    private ImovelDTO imovel;

}
