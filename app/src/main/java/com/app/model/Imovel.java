package com.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import javax.persistence.GenerationType;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "imovel")
@NoArgsConstructor @Data
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @ManyToOne()
    @JoinColumn(name="proprietario_id", referencedColumnName = "id")
    private Proprietario proprietario;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "local_id", referencedColumnName = "id")
    private Local local;

    @Column(name = "tipo_imovel")
    @Enumerated(EnumType.STRING)
    private TipoImovel tipoImovel;

    @Column(name = "iptu_squencial_imobiliario")
    private String IPTUSequencialImobiliario;

    @Column(name = "celpe_conta_contrato")//XXXXXXXXXX
    private String celpeContaContrato;

    @Column(name = "compesa_matricula")//XXXXXXXX.X
    private String compesaMatricula;

    public enum TipoImovel {
        CASA, APARTAMENTO, TERRENO
    }


}

