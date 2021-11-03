package com.app.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "proprietario")
@NoArgsConstructor @Data 
public class Proprietario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "cpf", nullable = false)
    private String cpf;
    
    @Column(name = "nome", nullable = false)
    private String nome;

    @OneToMany(mappedBy = "proprietario", fetch = FetchType.LAZY)  
    private Set<Imovel> imoveis = new HashSet<>();

}
