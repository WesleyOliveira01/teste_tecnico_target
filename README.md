# README - Teste Técnico para Vaga de Estágio em Desenvolvimento

Este repositório contém o código-fonte de um teste técnico realizado para a vaga de estágio em desenvolvimento na **Target Sistemas**. O código está escrito em **Java** e aborda duas questões: a **Questão 2** relacionada à sequência de Fibonacci e a **Questão 5** que trata da inversão de uma string.

## Questão 2: Pertencimento à Sequência de Fibonacci

O método `estaNaSequencia(Integer num)` verifica se um número inteiro `num` pertence à sequência de Fibonacci. Ele utiliza dois números auxiliares, `a` e `b`, para iterar pela sequência até encontrar um valor igual a `num`. Se encontrar, exibe uma mensagem indicando que o número pertence à sequência; caso contrário, informa que não pertence.

Exemplo de uso:
```java
Integer numero = 21;
estaNaSequencia(numero); // Saída: 21 pertence à sequência de Fibonacci.
```

## Questão 5: Inversão de String

O método `reverteString(String palavra)` recebe uma string `palavra` e a inverte, retornando a versão invertida. Ele utiliza um array de caracteres para realizar a inversão, trocando os caracteres da posição inicial com os da posição final.

Exemplo de uso:
```java
String palavra = "qualquer coisa";
String palavraInvertida = reverteString(palavra);
System.out.println(palavraInvertida); // Saída: asiohc reuqleuq
```

## Como Executar o Código

1. Certifique-se de ter o ambiente Java configurado.
2. Compile o arquivo `Main.java`:
   ```
   javac Main.java
   ```
3. Execute o programa:
   ```
   java Main
   ```
