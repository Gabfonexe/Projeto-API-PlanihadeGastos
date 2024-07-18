package com.gabrielf.gabriel.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.gabrielf.gabriel.model.imovel.ConfiguracaoImovel;
import com.gabrielf.gabriel.model.imovel.EstoqueImovel;
import com.gabrielf.gabriel.service.impl.ImovelServiceImpl;

@RestController
@RequestMapping("/imovel")
public class ImovelController {

  private final ImovelServiceImpl imovelServiceImpl;

  public ImovelController(ImovelServiceImpl imovelServiceImpl){
    this.imovelServiceImpl = imovelServiceImpl;
  }

  @PostMapping("/cadastrar/config")
  public ResponseEntity<ConfiguracaoImovel> criar(@RequestBody ConfiguracaoImovel configuracao){
    var configCriada = imovelServiceImpl.criarConfig(configuracao);
    URI local = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(configCriada.getId()).toUri();
    return ResponseEntity.created(local).body(configCriada);
  }

  @PostMapping("/cadastrar/estoque")
  public ResponseEntity<EstoqueImovel> criar(@RequestBody EstoqueImovel estoque){
    var estoqueCriado = imovelServiceImpl.criarEstoque(estoque);
    URI local = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(estoqueCriado.getId()).toUri();
    return ResponseEntity.created(local).body(estoqueCriado);
  }

  @GetMapping("/listar/config")
  public ResponseEntity <?> listarConfiguracoes(){
    List<ConfiguracaoImovel> configuracoes = imovelServiceImpl.listarImovelConfig();
    return ResponseEntity.ok(configuracoes);
  }

  @GetMapping("/listar/estoque")
  public ResponseEntity <?> listarEstoques(){
    List<EstoqueImovel> estoques = imovelServiceImpl.listarImovelEstoque();
    return ResponseEntity.ok(estoques);
  }

  @GetMapping("/calcularconfig/{id}")
  public ResponseEntity<?>  calcularConfig(@PathVariable Long id){
    Double configuracao = imovelServiceImpl.somar(id);
    return ResponseEntity.ok(configuracao);
  }

  @GetMapping("/calcularestoque/{id}")
  public ResponseEntity<?>  calcularEstoque(@PathVariable Long id){
    Double estoque = imovelServiceImpl.somarEstoque(id);
    return ResponseEntity.ok(estoque);
  }

  @GetMapping("/listar/total")
  public ResponseEntity <?> listarTotal(){
    List<EstoqueImovel> estoques = imovelServiceImpl.listarImovelEstoque();
    List<Map<String, Object>> resultados = new ArrayList<>();
  
    for (EstoqueImovel item : estoques) {
      double soma = imovelServiceImpl.somarEstoque(item.getId());
      Map<String, Object> resultado = new HashMap<>();
        resultado.put("codigo", item.getCode());
        resultado.put("valorTotal", soma + 236);
        resultados.add(resultado);
    }

    return ResponseEntity.ok(resultados);
  }

}
