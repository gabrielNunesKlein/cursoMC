package com.klein.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klein.cursomc.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{

}
