package com.gabrielf.gabriel.model.lavanderia;

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
@Entity(name = "tb_valor_lavanderia_por_item")
public class ValorLavanderiaPorItem {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true, name = "Cidade")
  private String cidade;

  @Column(name = "Toalha de Rosto")
  private BigDecimal toalhaRosto = new BigDecimal(2.75);
  
  @Column(name = "Toalha de Piso")
  private BigDecimal toalhaPiso = new BigDecimal(3.53);

  /* 
  Faltantes: 

  @Column(name = "Toalha de Maquiagem")
  private BigDecimal toalhaMaquiagem = new BigDecimal(4.79);

  @Column(name = "Pano de Prato")
  private BigDecimal panoPrato = new BigDecimal(0);

  @Column(name = "Pano de Pia")
  private BigDecimal panoPia = new BigDecimal(0);

  @Column(name = "Colcha Solteiro")
  private BigDecimal colchaSolteiro = new BigDecimal(0);

  @Column(name = "Colcha Queen Size")
  private BigDecimal colchaQueenSize = new BigDecimal(0);

  @Column(name = "Colcha Casal")
  private BigDecimal colchaCasal = new BigDecimal(0);

  @Column(name = "Cobertor Queen")
  private BigDecimal cobertorQueen = new BigDecimal(0);
 */
  
  @Column(name = "Toalha de Banho")
  private BigDecimal toalhaBanho = new BigDecimal(4.79);

  @Column(name = "Manta Queen Size")
  private BigDecimal mantaQueenSize = new BigDecimal(16.61);

  @Column(name = "Lençol Solteiro")
  private BigDecimal lençolSolteiro = new BigDecimal(6.20);

  @Column(name = "Lençol Queen Size")
  private BigDecimal lençolQueenSize = new BigDecimal(8.54);

  @Column(name = "Lençol King Size")
  private BigDecimal lençolKingSize = new BigDecimal(9.33);

  @Column(name = "Lençol Casal")
  private BigDecimal lençolCasal = new BigDecimal(6.98);

  @Column(name = "Fronha")
  private BigDecimal fronha = new BigDecimal(3.07);

  @Column(name = "Edredom Solteiro")
  private BigDecimal edredomSolteiro = new BigDecimal(30.65);

  @Column(name = "Edredom Queen Size")
  private BigDecimal edredomQueenSize = new BigDecimal(41.76);

  @Column(name = "Edredom King Size")
  private BigDecimal edredomKingSize = new BigDecimal(42.54);

  @Column(name = "Edredom Casal")
  private BigDecimal edredomCasal = new BigDecimal(36.60);

  @Column(name = "Capa Edredom Solteiro")
  private BigDecimal capaEdredomSolteiro = new BigDecimal(12.54);

  @Column(name = "Capa Edredom Queen Size")
  private BigDecimal capaEdredomQueenSize = new BigDecimal(16.46);

  @Column(name = "Capa Edredom King Size")
  private BigDecimal capaEdredomKingSize = new BigDecimal(18.34);

  @Column(name = "Capa Edredom Casal")
  private BigDecimal capaEdredomCasal = new BigDecimal(16.46);
  
}
