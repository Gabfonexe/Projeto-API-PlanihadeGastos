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
@Entity(name = "tb_config_imovel")
public class ConfiguracaoImovel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true, name = "Code")
  private String code;

  @Column(name = "Camas de Solteiro")
  private Integer camasSolteiro;

  @Column(name = "Cama de Casal")
  private Integer camaCasal;

  @Column(name = "Cama Queen")
  private Integer camaQueen;

  @Column(name = "Cama King")
  private Integer camaKing;

  @Column(name = "Sofa Cama Solteiro")
  private Integer sofaCamaSolteiro;

  @Column(name = "Sofa Cama Casal")
  private Integer sofaCamaCasal;

  @Column(name = "Travesseiros")
  private Integer travesseiros;

  @Column(name = "Numero Quartos")
  private Integer numeroQuartos;

  @Column(name = "Numero Banheiros")
  private Integer numeroBanheiros;

  @Column(name = "Numero Lavabos")
  private Integer numeroLavabos;

  @Column(name = "Numero Hóspedes")
  private Integer numeroHospedes;

  
}
