package com.klein.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klein.cursomc.domain.Pedido;
import com.klein.cursomc.repositories.PedidoRepository;
import com.klein.cursomc.services.execptions.ObjectNotFountException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFountException(
				 "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
