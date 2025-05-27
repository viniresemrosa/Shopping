# Shopping
Este projeto em Java simula um sistema de gerenciamento de lojas em um shopping center. Utiliza os principais conceitos de Programação Orientada a Objetos (POO), como herança, composição, polimorfismo e uso de arrays.
# 🛍️ Sistema de Gerenciamento de Lojas (Java)

Este projeto é uma simulação de um sistema de gerenciamento de lojas dentro de um shopping center. Ele foi desenvolvido com foco em **Programação Orientada a Objetos (POO)** utilizando a linguagem **Java**.

## 📚 Objetivo

O sistema permite:
- Criar lojas de diferentes tipos com atributos específicos.
- Gerenciar produtos no estoque de cada loja.
- Realizar cálculos como gasto com salários e seguro de eletrônicos.
- Usar herança e polimorfismo para representar diferentes categorias de lojas.

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Paradigma de Programação Orientada a Objetos (POO)
- IDE recomendada: IntelliJ IDEA / Eclipse / VS Code com extensão Java

---

## 📦 Estrutura do Projeto
├── src/
│ ├── Loja.java
│ ├── Produto.java
│ ├── Endereco.java
│ ├── Data.java
│ ├── Cosmetico.java
│ ├── Vestuario.java
│ ├── Bijuteria.java
│ ├── Alimentacao.java
│ ├── Informatica.java
│ └── Shopping.java
├── ValidadorEtapaX.java
└── README.md


## 🧱 Classes Principais

### ✅ `Loja`
Classe base com atributos como nome, quantidade de funcionários, endereço, data de fundação e array de produtos.

### 🧴 `Cosmetico`
Subclasse com taxa de comercialização.

### 👕 `Vestuario`
Subclasse com atributo indicando se vende produtos importados.

### 💻 `Informatica`
Subclasse com seguro sobre produtos eletrônicos.

### 🍔 `Alimentacao`
Subclasse com data de alvará de funcionamento.

### 💍 `Bijuteria`
Subclasse com valor de estoque total.

---
