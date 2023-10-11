package com.digitalwave.recrutatech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.digitalwave.recrutatech.entity.Atitude;
import com.digitalwave.recrutatech.entity.Cha;
import com.digitalwave.recrutatech.entity.Conhecimento;
import com.digitalwave.recrutatech.entity.Habilidade;
import com.digitalwave.recrutatech.interfaces.IChaService;
import com.digitalwave.recrutatech.repository.ChaRepository;

public class ChaService implements IChaService {
    @Autowired
    private ChaRepository chaRepo;

    @Override
    public Cha newCha(Cha cha) {
        return chaRepo.save(cha);
    }
    
    public Cha createCha(Conhecimento conhecimento, Habilidade habilidade, Atitude atitude) {
        Cha cha = new Cha();
        cha.setConhecimento(conhecimento);
        cha.setHabilidade(habilidade);
        cha.setAtitude(atitude);
        return chaRepo.save(cha);
    }

	public List<Cha> findAllCha(){
		return chaRepo.findAll();
	}
	
    public Cha findChaId(Long id) {
        Optional<Cha> chaOp = chaRepo.findById(id);
        if(chaOp.isEmpty()) {
            throw new IllegalArgumentException("CHA não encontrado!");
        }
        return chaOp.get();
    }



}
