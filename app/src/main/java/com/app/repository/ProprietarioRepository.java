package com.app.repository;

import com.app.model.Proprietario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprietarioRepository extends JpaRepository<Proprietario, Long>, ProprietarioRepositoryCustom{
        
    // SPRING DATA ANNOTATED METHODS HERE:
}
