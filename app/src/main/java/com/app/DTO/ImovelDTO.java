package com.app.DTO;


import com.app.model.Imovel.TipoImovel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter @Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ImovelDTO {

    @Setter(AccessLevel.NONE)
    private Long id;
    private String nome;
    private String descricao;
    @JsonIgnoreProperties
    private ProprietarioDTO proprietario;
    @JsonIgnore
    private LocalDTO local;
    private TipoImovel tipoImovel;
    private String IPTUSequencialImobiliario;
    private String celpeContaContrato;
    private String compesaMatricula;

}

