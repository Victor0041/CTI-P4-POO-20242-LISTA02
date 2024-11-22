# README

Este repositório contém uma série de exercícios de lógica de programação implementados em Java. Os exercícios abordam conceitos básicos e intermediários de controle de fluxo, entrada e saída de dados, manipulação de variáveis e cálculos simples. Abaixo estão os exercícios realizados.

## Descrição de Algumas Questões

### 1. **Cálculo de Soma e Média**
Calcula a soma, a média e a porcentagem de números ímpares inseridos pelo usuário, além de determinar o maior e menor número.

### 2. **Cadastro de Funcionários**
Solicita dados de funcionários (sexo, idade, experiência) e calcula médias, percentuais e outras informações, como quantidade de funcionários em faixas de idade específicas.

### 3. **Cálculo de Consumo de Energia**
Calcula o valor do consumo de energia com base em diferentes tipos de consumidores (residencial, comercial, industrial), aplicando acréscimos nas tarifas conforme o tipo de consumo.

### 4. **Impostos e Cálculo de Novo Salário**
Calcula o imposto de renda com base no salário e também aplica aumentos salariais dependendo da faixa salarial do funcionário.

### 5. **Controle de Produtos e Transporte Internacional**
Calcula o preço final de um produto importado, levando em consideração impostos, transporte, seguro e condições de origem e transporte.

## Como Usar em Diferentes Plataformas

### Em Python

Para executar o código em Python, basta seguir as instruções abaixo para a versão correspondente.

#### Instalação e Execução:
1. Instale Python em sua máquina (se não tiver instalado).
2. Salve o código Python em um arquivo com a extensão `.py`.
3. Execute o código via terminal/linha de comando com o comando:
    ```bash
    python3 nome_do_arquivo.py
    ```

#### Exemplo em Python:
```python
angulo = float(input("Digite o valor do ângulo (em graus): "))
if angulo > 360 or angulo < -360:
    voltas = int(angulo / 360)
else:
    voltas = 0
```

### Em JavaScript

Para rodar o código em JavaScript, use um navegador ou um ambiente de execução como o Node.js.

### Execução:
1. Abra o navegador ou terminal.
2. Coloque o código JavaScript dentro de uma tag <script> ou em um arquivo .js para ser executado em um ambiente Node.js.

#### Exemplo em JavaScript:
```javascript
let angulo = parseFloat(prompt("Digite o valor do ângulo (em graus):"));
let voltas;
if (angulo > 360 || angulo < -360) {
    voltas = Math.floor(angulo / 360);
} else {
    voltas = 0;
}
// Lógica do quadrante segue da mesma forma
```

### Em C

Se você quiser rodar o código em C, basta ter um compilador de C, como o GCC ou o Clang.

### Execução:
1. Salve o código C em um arquivo .c.
2. Compile o código com o compilador:
```bash
   gcc nome_do_arquivo.c -o nome_do_programa
```
3. Execute o programa gerado:
```bash
  ./nome_do_programa
```

### Em C++

No caso do C++, o processo de compilação é similar ao de C, com o uso do compilador g++.

### Execução:
1. Salve o código C++ em um arquivo .cpp.
2. Compile o código com o comando:
```bash
  g++ nome_do_arquivo.cpp -o nome_do_programa
```
3. Execute o programa gerado:
```bash
  ./nome_do_programa
```

## Conclusão

Os exercícios realizados abordam conceitos fundamentais de lógica de programação, como controle de fluxo, manipulação de variáveis e cálculos simples. Através de problemas práticos, como cálculo de salários, consumo de energia e análise de dados, foi possível desenvolver habilidades essenciais para resolver problemas de forma estruturada e eficiente. Essas atividades reforçam a importância de uma boa base em lógica para a criação de programas funcionais e eficazes. As instruções de execução fornecem uma maneira fácil de usar o código em Python, JavaScript, C e C++.


