# README

Este repositório contém implementações de problemas simples de programação, abordando conceitos como cálculos matemáticos, controle de fluxo (condicionais e loops), e manipulação de entradas e saídas.

## Descrição de Algumas Questões

### 1. Cálculo de Salário com Impostos e Gratificação
- **Objetivo**: O programa calcula o salário bruto de um trabalhador com base no número de horas trabalhadas, o valor do salário mínimo e o turno de trabalho (matutino, vespertino ou noturno). Além disso, ele considera o imposto e a gratificação dependendo do cargo (operário ou gerente), além de um vale alimentação, e determina a classificação do salário líquido como "mal remunerado", "normal" ou "bem remunerado".
- **Lógica**: 
  - Cálculo do valor por hora baseado no turno.
  - Cálculo do imposto de acordo com o cargo.
  - Determinação de gratificação com base no turno e horas trabalhadas.
  - Cálculo do salário líquido, levando em conta o vale alimentação e o imposto.

### 2. Cálculo do Preço de Produto com Desconto e Imposto
- **Objetivo**: O programa calcula o preço de um produto com base no tipo de produto (alimentação, limpeza ou vestuário), se o produto precisa ou não de refrigeração, e aplica taxas adicionais, imposto e desconto.
- **Lógica**:
  - O programa ajusta o preço com base nas condições do produto.
  - Calcula o imposto, o custo final do produto e aplica um desconto baseado no tipo e necessidade de refrigeração.

### 3. Determinação do Quadrante de um Ângulo
- **Objetivo**: O programa determina em qual quadrante o ângulo (em graus) se encontra, ou se está sobre um eixo. Também calcula o número de voltas (no sentido horário ou anti-horário).
- **Lógica**:
  - O ângulo é verificado para determinar em qual quadrante se encontra.
  - O número de voltas é calculado com base no ângulo e o programa exibe se o movimento foi horário ou anti-horário.

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

Esse repositório contém soluções simples para cálculos de salário, manipulação de preços e ângulos, que podem ser facilmente adaptadas para diferentes linguagens de programação. As instruções de execução fornecem uma maneira fácil de usar o código em Python, JavaScript, C e C++.
