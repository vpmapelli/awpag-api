[![en](https://img.shields.io/badge/lang-en-red.svg)](./README.md)
[![pt-br](https://img.shields.io/badge/lang-pt--br-green.svg)](./README.pt-br.md)

# Sobre

Este é um projeto simples de estudos criando uma API Restful com framework Spring durante um evento online organizado pela Algaworks, chamado "Intensivão Spring REST".

# Tópicos estudados

- Visão geral do ecossistema Spring
- Repository resources
- Códigos e status HTTP
- Content negotiation
- Flyway
- Jakarta Persistance
- Spring Data JPA
- Operações CRUD
- Jakart Bean Validation
- Domain services
- Validation groups
- Melhores práticas com Exception Handler
- Isolamento do Domain model e representation model
- Uso do ModelMapper para transformação de objetos

# Como executar

A forma mais simples é navegar até a pasta raiz do projeto e executar o comando:

```
docker compose up
```

Lembre-se de utilizar a versão [Docker Compose V2](https://docs.docker.com/compose/migrate/).

Depois de executar o comando, a API responderá em localhost:8080.

Essa forma de execução foi testada apenas no sistema Linux, especificamente na distribuição Ubuntu 22.04.

# Endpoints

## End-point: Clientes - Listar
### Method: GET
>```
>localhost:8080/clientes
>```
### Headers

|Content-Type|Value|
|---|---|
|Accept|application/json|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Clientes - Adicionar
### Method: POST
>```
>localhost:8080/clientes
>```
### Body (**raw**)

```json
{
    "nome": "José da Silva",
    "email":"jose@algaworks.com.br",
    "telefone":"34 9999-9999"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Clientes - Buscar
### Method: GET
>```
>localhost:8080/clientes/5
>```

⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Clientes - Delete
### Method: DELETE
>```
>localhost:8080/clientes/1
>```

⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Clientes - Atualizar
### Method: PUT
>```
>localhost:8080/clientes/1
>```
### Body (**raw**)

```json
{
    "nome": "João da Silva",
    "email": "jose@algaworks.com.br",
    "telefone": "34 9999-2222"
}
```

# Project: Parcelamentos

## End-point: Parcelamentos - Listar
### Method: GET
>```
>localhost:8080/parcelamentos
>```

⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Parcelamentos - Buscar
### Method: GET
>```
>localhost:8080/parcelamentos/1
>```

⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Parcelamentos - Adicionar
### Method: POST
>```
>localhost:8080/parcelamentos
>```
### Body (**raw**)

```json
{
    "descricao": "Cadeira",
    "valorTotal": 1000,
    "quantidadeParcelas": 11,
    "cliente": {
        "id": 1
    }
}
```