# API Restful com Spring Boot e MongoDB

Este é um projeto de demonstração utilizando Spring Boot e MongoDB, desenvolvido como parte de um curso do Nelio Alves. O objetivo do projeto é explorar e implementar operações de CRUD em um banco de dados orientado a documentos, bem como compreender as diferenças entre os paradigmas orientado a documentos e relacional.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.3.1
- MongoDB
- Spring Data MongoDB

## Objetivos do Projeto
- Compreender as principais diferenças entre paradigma orientado a documentos e relacional.
- Implementar operações de CRUD.
- Refletir sobre decisões de design para um banco de dados orientado a documentos.
- Implementar associações entre objetos (objetos aninhados e referências).
- Realizar consultas com Spring Data e MongoRepository.

## Estrutura do Projeto

A aplicação consiste em três entidades principais:

1. **User**
2. **Post**
3. **Comment**

### Funcionalidades Implementadas

- **Usuário**
  - Obter usuário por ID (`GET /users/{id}`)
  - Inserir novo usuário (`POST /users`)
  - Deletar usuário (`DELETE /users/{id}`)
  - Atualizar usuário (`PUT /users/{id}`)

- **Post**
  - Obter todos os posts de um usuário (`GET /users/{id}/posts`)
  - Obter post por ID (`GET /posts/{id}`)

## Como Executar o Projeto
1. Certifique-se de ter o MongoDB instalado e em execução em sua máquina local.
2. Clone o repositório do projeto:
```console
git clone https://github.com/taisdias76/APIRest.git
```
3. Navegue até o diretório do projeto:
```console
cd workshopmongo
```
4. Execute o projeto utilizando Maven:
```console
mvn spring-boot:run
```




Feito com ❤️ por Tais
