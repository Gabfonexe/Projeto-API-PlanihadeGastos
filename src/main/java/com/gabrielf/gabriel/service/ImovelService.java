package com.gabrielf.gabriel.service;


import java.util.List;

import com.gabrielf.gabriel.model.imovel.ConfiguracaoImovel;
import com.gabrielf.gabriel.model.imovel.EstoqueImovel;

public interface ImovelService {

  /*Como a base dos dados da planilha é estático, não preciso utilizar métodos de deletar ou alterar, basta somente os métodos de criar e listar imóveis */

  ConfiguracaoImovel criarConfig(ConfiguracaoImovel config);

  EstoqueImovel criarEstoque(EstoqueImovel estoque);

  List<ConfiguracaoImovel> listarImovelConfig();

  List<EstoqueImovel> listarImovelEstoque();

  Double somar(Long id);

  Double somarEstoque(Long id);

 
}
