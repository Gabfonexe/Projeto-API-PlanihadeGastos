package com.gabrielf.gabriel.model.imovel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tb_estoque_imovel")
public class EstoqueImovel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true, name = "Code")
  private String code;

  @Column(name = "Toalha de Rosto")
  private Integer toalhaRosto;
  
  @Column(name = "Toalha de Piso")
  private Integer toalhaPiso;

  @Column(name = "Toalha de Maquiagem")
  private Integer toalhaMaquiagem;

  @Column(name = "Toalha de Banho")
  private Integer toalhaBanho;

  @Column(name = "Pano de Prato")
  private Integer panoPrato;

  @Column(name = "Pano de Pia")
  private Integer panoPia;

  @Column(name = "Manta Queen Size")
  private Integer mantaQueenSize;

  @Column(name = "Lençol Solteiro")
  private Integer lençolSolteiro;

  @Column(name = "Lençol Queen Size")
  private Integer lençolQueenSize;

  @Column(name = "Lençol King Size")
  private Integer lençolKingSize;

  @Column(name = "Lençol Casal")
  private Integer lençolCasal;

  @Column(name = "Fronha")
  private Integer fronha;

  @Column(name = "Edredom Solteiro")
  private Integer edredomSolteiro;

  @Column(name = "Edredom Queen Size")
  private Integer edredomQueenSize;

  @Column(name = "Edredom King Size")
  private Integer edredomKingSize;

  @Column(name = "Edredom Casal")
  private Integer edredomCasal;

  @Column(name = "Colcha Solteiro")
  private Integer colchaSolteiro;

  @Column(name = "Colcha Queen Size")
  private Integer colchaQueenSize;

  @Column(name = "Colcha Casal")
  private Integer colchaCasal;

  @Column(name = "Cobertor Queen")
  private Integer cobertorQueen;

  @Column(name = "Capa Edredom Solteiro")
  private Integer capaEdredomSolteiro;

  @Column(name = "Capa Edredom Queen Size")
  private Integer capaEdredomQueenSize;

  @Column(name = "Capa Edredom King Size")
  private Integer capaEdredomKingSize;

  @Column(name = "Capa Edredom CasaL")
  private Integer capaEdredomCasal;
  
}
