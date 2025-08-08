# 🩺 Voll.med API
![Java](https://img.shields.io/badge/Java-17-blue?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.2-brightgreen?logo=springboot)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?logo=mysql)
![License](https://img.shields.io/badge/license-MIT-lightgrey)


API REST desenvolvida com **Spring Boot 3** como parte do curso [Spring Boot 3: desenvolva uma API Rest em Java](https://cursos.alura.com.br/course/spring-boot-3-desenvolva-api-rest-java) da Alura.

Este projeto simula a gestão de médicos e pacientes para uma clínica fictícia chamada **Voll.med**, implementando um CRUD completo com boas práticas do ecossistema Spring.

---

## 🚀 Tecnologias utilizadas

- **Java 17**
- **Spring Boot 3**
  - Spring Web
  - Spring Data JPA
  - Bean Validation
- **MySQL**
- **Flyway** (versionamento do banco)
- **Lombok**
- **Maven**

---

## 📁 Estrutura do Projeto

- `Medico`: entidade principal com operações de cadastro, listagem paginada, atualização e inativação lógica.
- `Endereco`: classe embutida para representar os dados de endereço.
- `DTOs`: utilizados para entrada e saída de dados, mantendo o domínio desacoplado da representação.
- `Repository`: interface estendendo `JpaRepository` com métodos customizados.
- `Controller`: expõe os endpoints RESTful.
- `Migration`: scripts SQL gerenciados pelo Flyway para criação das tabelas.

---
## 📦 Endpoints principais

| Método | Rota            | Descrição                         |
|--------|------------------|-----------------------------------|
| POST   | `/medicos`       | Cadastrar novo médico             |
| GET    | `/medicos`       | Listar médicos ativos             |
| PUT    | `/medicos`       | Atualizar dados de um médico      |
| DELETE | `/medicos/{id}`  | Inativar um médico (soft delete)  |

---

## ✅ Funcionalidades atuais

- Cadastro de médicos com validações de campos obrigatórios
- Listagem paginada de médicos ativos
- Atualização parcial de dados do médico
- Inativação lógica (soft delete)
- Versionamento do banco de dados com Flyway
- Documentação e boas práticas com Spring Boot

---

## 🔮 Aprimoramentos futuros

- Implementação do módulo de pacientes
- Autenticação com Spring Security e JWT
- Testes unitários e de integração com JUnit e Mockito
- Integração com Swagger/OpenAPI para documentação automatizada
- Deploy da API em ambiente cloud (Heroku, Render, etc)
- Validações customizadas e mensagens internacionalizadas
- Integração com banco de dados em container Docker

