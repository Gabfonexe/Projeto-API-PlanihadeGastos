package com.gabrielf.gabriel.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gabrielf.gabriel.model.imovel.ConfiguracaoImovel;
import com.gabrielf.gabriel.model.imovel.EstoqueImovel;
import com.gabrielf.gabriel.repository.ImovelConfiguracaoRepository;
import com.gabrielf.gabriel.repository.ImovelEstoqueRepository;
import com.gabrielf.gabriel.service.ImovelService;

@Service
public class ImovelServiceImpl implements ImovelService {

  /*Como os dados são estáticos, não irei utilizar validações ou Exceptions, pois são imutáveis e eu mesmo que irei adicionar os dados e não o usuário*/

  private final ImovelConfiguracaoRepository icr;
  private final ImovelEstoqueRepository ier;

  public ImovelServiceImpl(ImovelConfiguracaoRepository icr, ImovelEstoqueRepository ier){
    this.icr = icr;
    this.ier = ier;
  }

  @Override
  public ConfiguracaoImovel criarConfig(ConfiguracaoImovel config) {
    return icr.save(config);  
  }

  @Override
  public EstoqueImovel criarEstoque(EstoqueImovel estoque) {
    return ier.save(estoque);
  }

  @Override
  public List<ConfiguracaoImovel> listarImovelConfig() {
    List<ConfiguracaoImovel> configuracoes = icr.findAll();
    return configuracoes;
  }

  @Override
  public List<EstoqueImovel> listarImovelEstoque() {
    List<EstoqueImovel> estoques = ier.findAll();
    return estoques;
  }

  @Override
  public Double somar(Long id) {
    var imovel = icr.findById(id);
    
    /*
    var a = imovel.get().getCamaCasal();
    var b = imovel.get().getCamaKing();
    var c = imovel.get().getCamaQueen();
    var d = imovel.get().getCamasSolteiro();
    var i = imovel.get().getSofaCamaCasal(); 
    var j = imovel.get().getSofaCamaSolteiro(); 
    var k = imovel.get().getTravesseiros(); 
    var f = imovel.get().getNumeroHospedes();
    */
    

    var a = imovel.get().getNumeroBanheiros(); // conta
    var b = imovel.get().getNumeroLavabos(); // conta
    var c = imovel.get().getNumeroQuartos(); // conta
    // gerar o total

    double somaBanheiroLavabo = (a * 7) + (b * 4.5);

    Double valorTotal = 0.0;

    switch (c) {
      case 1:
        valorTotal = somaBanheiroLavabo + 220;
        break;
      case 2:
        valorTotal = somaBanheiroLavabo + 250;
      case 3:
        valorTotal = somaBanheiroLavabo + 250;
      case 4: 
        valorTotal = somaBanheiroLavabo + 320;
      case 5: 
        valorTotal = somaBanheiroLavabo + 250;
      case 6:
        valorTotal= somaBanheiroLavabo + 300;
      case 7:
        valorTotal = somaBanheiroLavabo + 320;
      case 8:
        valorTotal = somaBanheiroLavabo + 350;
    }
    return valorTotal + 9;
  }

  @Override
  public Double somarEstoque(Long id) {
    var estoque = ier.findById(id);

    var a = estoque.get().getCapaEdredomCasal();
    var b = estoque.get().getCapaEdredomKingSize();
    var c = estoque.get().getCapaEdredomQueenSize();
    var d = estoque.get().getCapaEdredomSolteiro();
    var e = estoque.get().getColchaCasal(); // sem dados de valor
    var f = estoque.get().getEdredomCasal();
    var g = estoque.get().getEdredomQueenSize();
    var h = estoque.get().getFronha();
    var i = estoque.get().getLençolCasal();
    var j = estoque.get().getLençolQueenSize();
    var k = estoque.get().getLençolSolteiro();
    var l = estoque.get().getMantaQueenSize();
    var m = estoque.get().getToalhaBanho();
    var n = estoque.get().getToalhaPiso();
    var o = estoque.get().getToalhaRosto();

    Double total = 
    (a * 16.46) + (b * 18.34) + (c * 16.46) + 
    (d * 12.54) + (e * 0.000) + (f * 36.60) +
    (g * 41.76) + (h * 3.070) + (i * 6.980) +
    (j * 8.540) + (k * 6.200) + (l * 16.61) +
    (m * 4.790) + (n * 3.530) + (o * 2.750);

    return total;
    
  }

}
