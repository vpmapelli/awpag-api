package com.algaworks.awpag.domain.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
//Caso fosse necessário um mapeamento com o banco para uma tabela chamada tb_cliente
//@Table(name = "tb_cliente")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public class Cliente {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "nome")
    private String nome;
    private String email;

    @Column(name = "fone")
    private String telefone;

}
