package com.app.service;

import java.util.List;

import com.app.model.Imovel;
import com.app.repository.ImovelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImovelServiceImpl implements ImovelService{
    
    @Autowired
    private ImovelRepository imovelRepository;

    public List<Imovel> getAllImoveis(){
        return imovelRepository.findAll();
    }
}
