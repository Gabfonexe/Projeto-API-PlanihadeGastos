package com.gabrielf.gabriel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielf.gabriel.model.imovel.EstoqueImovel;

public interface ImovelEstoqueRepository extends JpaRepository<EstoqueImovel, Long>{
  
}
