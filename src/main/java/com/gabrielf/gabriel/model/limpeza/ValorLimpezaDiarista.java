package com.gabrielf.gabriel.model.limpeza;

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
@Entity(name = "tb_valor_limpeza_diarista")
public class ValorLimpezaDiarista {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "Numero de Quartos")
  private Integer numeroQuartos;

  @Column(precision = 5, scale = 2, name = "Valor")
  private BigDecimal valor;
  
}
