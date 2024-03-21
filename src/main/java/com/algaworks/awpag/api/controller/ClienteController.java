package com.algaworks.awpag.api.controller;

import com.algaworks.awpag.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar(){
        Cliente cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("João");
        cliente1.setTelefone("34 99999-11111");
        cliente1.setEmail("joaodascouves@algaworks.com.br");

        Cliente cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Maria");
        cliente2.setTelefone("16 97777-1111");
        cliente2.setEmail("mariadasilva@algaworks.com.br");

        return Arrays.asList(cliente1, cliente2);

    }

}
