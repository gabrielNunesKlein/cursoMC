package com.klein.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klein.cursomc.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
