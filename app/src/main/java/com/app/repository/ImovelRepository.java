package com.app.repository;

import com.app.model.Imovel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImovelRepository extends JpaRepository<Imovel, Long>, ImovelRepositoryCustom{
    
    // SPRING DATA ANNOTATED METHODS HERE:
}
