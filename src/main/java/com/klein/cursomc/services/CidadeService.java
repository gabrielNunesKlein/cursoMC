package com.klein.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klein.cursomc.domain.Cidade;
import com.klein.cursomc.repositories.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository repo;
	
	public List<Cidade> find(Integer estadoId){
		return repo.findCidades(estadoId);
	}
	
}
