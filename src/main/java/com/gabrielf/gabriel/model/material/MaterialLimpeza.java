package com.gabrielf.gabriel.model.material;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tb_material_limpeza")
public class MaterialLimpeza {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  

  @Column(unique = true, name = "Item")
  private String item;

  @Column(precision = 5, scale = 2, name = "Valor")
  private BigDecimal valor;

  @Column(name = "Quantidade por Imovel")
  private Integer quantidadePorImovel;
  
}
