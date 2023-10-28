# Testes unitários para uma Calculadora em Java
Atividade de composição de nota para a AC1 da disciplina de Qualidade e Testes de Software. Análise e Desenvolvimento de Sistemas, 4o semestre - FACENS.

## Descrição do repositório
Esse repositório representa o funcionamento de uma calculadora e aplica testes unitários visando garantir a qualidade do sistema. <br />

Cada operação matemática é representada por uma classe individual. Cada classe possui 2 classes equivalentes de testes unitários 
(uma implementada manualmente e outra utilizando a biblioteca JUnit na versão 4). Esse projeto serve para demonstrar a importância
de se escrever testes unitários, e as diferenças entre implementar testes manualmente e utilizando uma biblioteca especializada (JUnit).

## Esta branch
Esta branch possui os testes criados com a biblioteca JUnit 4 e a documentação do projeto utilizando *JavaDoc*.
Para rodar, basta rodar os métodos das classes de teste, por exemplo: `SomaJunitTest`

Abaixo, segue a imagem de exemplo de alguns testes da classe `SomaJunitTest`.
![image](https://github.com/nicolasgandrade/calculadora-tqs/assets/82426254/723dd804-7abe-456c-8762-28e683f254b3)

## Documentação
A Documentação foi escrita utilizando JavaDoc, sendo assim, há uma página HTML que pode ser verificada
dentro da pasta `/doc/calculadora/index.html`. <br />
Abaixo, seguem algumas imagens de exemplo da página web gerada pelo JavaDoc da classe `Soma`.
![image](https://github.com/nicolasgandrade/calculadora-tqs/assets/82426254/dd1a658d-828c-48f4-9132-a1625f8dc711)
![image](https://github.com/nicolasgandrade/calculadora-tqs/assets/82426254/9f38c431-fd38-47ee-8f6f-13ca131ebbac)
![image](https://github.com/nicolasgandrade/calculadora-tqs/assets/82426254/034aa227-72d3-40c4-bb12-e08873ba9661)
![image](https://github.com/nicolasgandrade/calculadora-tqs/assets/82426254/d5366a2a-2901-42d0-8fbd-6eace7607337)



## Como rodar
O projeto utiliza o Maven como gerenciador de dependências, portanto para rodar fora de uma IDE, 
assegure que o maven está instalado na sua máquina e use os seguintes comandos:
```
mvn clean install
mvn test
```
Utilizando uma IDE como o IntellijIDEA, basta utilizar o runner do programa que tudo é feito automaticamente.
<hr>
Última atualização 28/10/21
