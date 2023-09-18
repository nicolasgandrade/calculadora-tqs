# Testes unitários para uma Calculadora em Java
Atividade de composição de nota para a AC1 da disciplina de Qualidade e Testes de Software. Análise e Desenvolvimento de Sistemas, 4o semestre - FACENS.

## Descrição do repositório
Esse repositório representa o funcionamento de uma calculadora e aplica testes unitários visando garantir a qualidade do sistema. <br />

Cada operação matemática é representada por uma classe individual. Cada classe possui 2 classes equivalentes de testes unitários 
(uma implementada manualmente e outra utilizando a biblioteca JUnit na versão 4). Esse projeto serve para demonstrar a importância
de se escrever testes unitários, e as diferenças entre implementar testes manualmente e utilizando uma biblioteca especializada (JUnit).

## Esta branch
Esta branch possui os testes criados manualmente, ou seja, sem JUNIT.
Para rodar, basta rodas os métodos main em cada classe teste, por exemplo: `SomaTeste`

Abaixo, segue a imagem de exemplo de alguns testes da classe `SomaTeste`.
![image](https://github.com/nicolasgandrade/calculadora-tqs/assets/82426254/bd2f9009-34d6-4627-8959-348333f7ebe7)

## Como rodar
O projeto utiliza o Maven como gerenciador de dependências, portanto para rodar fora de uma IDE, 
assegure que o maven está instalado na sua máquina e use os seguintes comandos:
```
mvn clean install
mvn test
```
Utilizando uma IDE como o IntellijIDEA, basta utilizar o runner do programa que tudo é feito automaticamente.
<hr>
Última atualização 17/09/21
