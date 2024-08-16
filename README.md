# DIO - Trilha Java Básico

## POO - Desafio

### Descrição do Desafio

Reforce seu conhecimento em Programação Orientada a Objetos (POO) em Java com um desafio de projeto totalmente prático. Para isso, os pilares da orientação a objetos são devidamente explorados no contexto bancário, onde o expert implementa um projeto de referência (disponibilizado no GitHub) de forma prática e interativa. Sendo assim, você poderá desenvolver sua capacidade de abstração reproduzindo essa solução. Além disso, caso queira ir além, implemente suas próprias evoluções e melhorias ;)

#### Objetivo:
O objetivo deste projeto prático hands-on é reforçar o conhecimento em Programação Orientada a Objetos (POO) em Java, através da implementação de um banco digital.

### Descrição:
Neste projeto, será disponibilizado no GitHub um projeto de referência que utiliza os conceitos de POO e Java para criar um banco digital. O contexto bancário será explorado para explorar os pilares da orientação a objetos, e assim, os participantes poderão reproduzir a solução e desenvolver sua capacidade de abstração.

### Requisitos Técnicos:
- Conhecimentos básicos de Programação Orientada a Objetos em Java;
- Ambiente de desenvolvimento Java configurado;
- Acesso à internet para acesso ao projeto de referência no GitHub;
- Familiaridade com o uso de repositórios Git (opcional, mas recomendado);
- Capacidade de abstração para reproduzir a solução proposta e implementar melhorias.

### Funcionalidades adicionadas

## Validações de Operações:

- Validação de saldo: Antes de sacar ou transferir, agora o sistema verifica se há saldo suficiente na conta.
- Prevenção de valores negativos: Não é mais permitido realizar saques ou depósitos com valores negativos.

## Histórico de Transações:

- Classe Transacao: Foi criada para registrar cada operação realizada em uma conta, como saques, depósitos e transferências.
- Histórico na Conta: Cada conta agora mantém um histórico de transações, permitindo que o usuário visualize todas as operações realizadas.

## Tipos de Conta:

- ContaCorrente com taxa de saque: Uma taxa fixa é aplicada a cada saque realizado em uma conta corrente.
- ContaPoupanca com rendimento mensal: Contas poupança aplicam automaticamente um rendimento de 2% ao saldo mensalmente.

## Gestão de Contas no Banco:

- Adicionar e remover contas: O banco agora pode adicionar e remover contas da sua lista.
- Buscar conta ou cliente: Implementados métodos para buscar contas pelo número ou clientes pelo nome.
- Interface de Usuário (Menu Console):
- Classe AppBanco: Adicionada para permitir a interação com o sistema via console. O usuário pode criar contas, sacar, depositar, transferir, imprimir extratos e visualizar o histórico de transações diretamente no console.



