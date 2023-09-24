package com.digitalwave.recrutatech.service;

import java.util.List;
import com.digitalwave.recrutatech.entity.Conhecimento;


public interface IConhecimentoService {
	public Conhecimento newConhecimento(Conhecimento conhecimento);
	
	public List<Conhecimento> findAllConhecimento();
	
	public Conhecimento findConhecimentoId (Long id);

}
