package com.gabrielf.gabriel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielf.gabriel.model.imovel.ConfiguracaoImovel;

public interface ImovelConfiguracaoRepository extends JpaRepository<ConfiguracaoImovel, Long>{
  
}
