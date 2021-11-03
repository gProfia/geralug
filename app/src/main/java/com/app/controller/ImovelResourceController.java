package com.app.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.app.DTO.ImovelDTO;
import com.app.model.Imovel;
import com.app.service.ImovelService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImovelResourceController {
    
    @Autowired
    private ImovelService imovelService;
    

    private ModelMapper modelMapper;

    @Autowired
    public ImovelResourceController(ModelMapper modelMapper){
        this.modelMapper = modelMapper;
        this.modelMapper.typeMap(Imovel.class, ImovelDTO.class)
            .addMapping(Imovel::getProprietario, ImovelDTO::setProprietario)
            .addMapping(Imovel::getLocal, ImovelDTO::setLocal);
            
    }

    @GetMapping("/imoveis") 
    public List<ImovelDTO> getImoveis() {
        List<Imovel> imoveis = imovelService.getAllImoveis();

        return imoveis.stream()
            .map(this::convertToImovelDTO)
            .collect(Collectors.toList());
    }

    private ImovelDTO convertToImovelDTO(Imovel imovel){
        ImovelDTO imovelDTO = modelMapper.map(imovel, ImovelDTO.class);
        return imovelDTO;
    }

}


