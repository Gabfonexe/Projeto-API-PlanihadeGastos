package com.gabrielf.gabriel.model.amenities;

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
@Entity(name = "tb_amenities")
public class Amenities {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long Id;

  @Column(unique = true, name = "Local")
  private String local;

  @Column(unique = true, name = "Item")
  private String item;

  @Column(precision = 5, scale = 2, name = "Valor")
  private BigDecimal valor;

 @Column(name = "Quantide por Banheiro e Lavabo")
  private Integer quantidadePorBanheiroLavabo;

  @Column(precision = 5, scale = 2, name = "Total")
  private BigDecimal total;

  
}
