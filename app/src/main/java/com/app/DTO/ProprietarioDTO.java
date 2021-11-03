package com.app.DTO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProprietarioDTO {

    @Setter(AccessLevel.NONE)
    private Long id;
    private String cpf;
    private String nome;
    @JsonIgnore
    private List<ImovelDTO> imoveis;
}
