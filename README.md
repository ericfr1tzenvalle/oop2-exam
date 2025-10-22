# Exam - POO II

Este repositório contém a resolução de **dois exercícios** focados na aplicação de **Padrões de Projeto (Design Patterns)** referentes a Prova da Disciplina de Programação Orientada a Objetos II.

> ⚠️ Cada exercício possui sua própria pasta `exercise` e um `README.md` detalhado (incluindo diagrama UML).

### 🇺🇸 English Introduction

This repository contains the solutions for **two exercises** focused on applying **Design Patterns in Java**, developed for the **Object-Oriented Programming II exam**.

> ⚠️ Each exercise is organized in its own folder with a detailed `README.md` and **Mermaid UML diagrams**.

---

## Exercício 1 – Ar-Condicionado Residencial

**Padrão Utilizado:** Observer

**Objetivo:**
Acionar a condensadora quando a temperatura do ambiente (detectada pelo sensor) é diferente daquela indicada pelo usuário (via controle remoto). Caso as temperaturas sejam iguais (dentro de uma tolerância), a condensadora deve entrar em stand-by.

**Papel das classes:**
* `Evaporadora` = Subject
* `Condesadora` = Observer

> ⚠️ Observação: a pasta `exercise1/` contém um `README.md` com explicação detalhada do fluxo, código e o diagrama UML em Mermaid.

---

## Exercício 2 – Gerar Relatórios de Venda

**Padrão Utilizado:** Factory Method

**Objetivo:**
Permitir a criação de diferentes tipos de relatórios de vendas (`HTML`, `PDF`, `CSV`) de forma flexível e desacoplada, mantendo o código cliente (`EmissaoRelatorios`) independente das implementações concretas de cada relatório.

**Papel das classes:**
* `RelatorioCreator` = Creator (interface)
* `CreatorHTML`, `CreatorPDF`, `CreatorCSV` = Concrete Creators
* `Relatorio` = Product (classe abstrata)
* `RelatorioHTML`, `RelatorioPDF`, `RelatorioCSV` = Concrete Products

> ⚠️ Observação: a pasta `exercise2/` contém um `README.md` com explicação detalhada, exemplos de saída esperada e o diagrama UML em Mermaid.

---
**Autor:** [ericfr1tzenvalle](https://github.com/ericfr1tzenvalle)
