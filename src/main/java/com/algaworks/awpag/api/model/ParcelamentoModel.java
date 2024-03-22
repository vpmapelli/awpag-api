package com.algaworks.awpag.api.model;

import com.algaworks.awpag.domain.model.Cliente;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Getter
@Setter
public class ParcelamentoModel {

    private Long id;
    private ClienteResumoModel cliente;
//    private String nomeCliente;
    private String descricao;
    private BigDecimal valorTotal;
    private Integer parcelas;
    private OffsetDateTime dataCriacao;

}
