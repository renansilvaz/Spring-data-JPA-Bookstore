# 📚 Bookstore API – Spring Boot + JPA

Este projeto é uma **API RESTful de uma livraria (Bookstore)**, desenvolvida com **Java + Spring Boot**, utilizando **Spring Data JPA** para persistência em banco de dados. O foco principal do projeto foi o **aprendizado e aprimoramento de mapeamentos de entidades e relacionamentos** em banco de dados usando JPA.

---

## 🚀 Objetivo

O principal objetivo desse projeto foi estudar a criação de entidades e o mapeamento entre elas, explorando os principais tipos de relacionamento:

- 🔗 @OneToOne
- 🔁 @OneToMany
- 🔁 @ManyToOne
- 🔄 @ManyToMany

---

## 📘 Observações
- Este projeto não tem foco em autenticação ou regras de negócio complexas, e sim no mapeamento correto entre entidades usando JPA.
- A API ainda pode ser evoluída com endpoints REST completos, DTOs, validações, testes automatizados e autenticação.

## 💡 Aprendizados
- Durante o desenvolvimento deste projeto, os principais pontos aprendidos foram:
- Como mapear entidades com os principais tipos de relacionamentos no JPA
- Como organizar entidades de forma clara e sem acoplamento circular
- Cuidados com fetch type, cascade e orphanRemoval

## 🛠️ Tecnologias utilizadas

- ✅ Java 21
- ✅ Spring Boot
- ✅ Spring Data JPA
- ✅ PostgreSQL
- ✅ Hibernate
- ✅ Maven

---

## 🧩 Entidades principais

- **Book (Livro)**
- **Author (Autor)**
- **Publisher (Publicadora)**
- **BookSummary (Resumo do livro)**

Cada entidade possui atributos básicos e está relacionada a outras de acordo com a estrutura de uma livraria real.

---

## 🔄 Relacionamentos implementados

| Entidade          | Relacionamento         | Tipo                  |
|-------------------|------------------------|-----------------------|
| Book → Author     | Muitos para Um         | `@ManyToOne`          |
| Book → Publisher  | Muitos para Um         | `@ManyToOne`          |
| Book → Summary    | Um para Um             | `@OneToOne`           |
| Author → Book     | Um para Muitos         | `@OneToMany`          |
| Book ↔ Category   | Muitos para Muitos     | `@ManyToMany` (caso implementado) |

---

## 📦 Como rodar o projeto

1. Clone o repositório:
git clone https://github.com/seu-usuario/nome-do-repo.git
cd nome-do-repo
