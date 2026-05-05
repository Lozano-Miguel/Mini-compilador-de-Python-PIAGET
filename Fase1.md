# Estrutura do Mini-Compilador de Python

## Símbolos

### 1. Operadores Aritméticos
* `+` (Adição)
* `-` (Subtração)
* `*` (Multiplicação)
* `/` (Divisão)
* `//` (Divisão inteira)
* `%` (Módulo)
* `**` (Exponenciação)
* `@` (Multiplicação de matrizes)

### 2. Operadores Relacionais
* `==` (Igual a)
* `!=` (Diferente de)
* `>` (Maior que)
* `<` (Menor que)
* `>=` (Maior ou igual a)
* `<=` (Menor ou igual a)

### 3. Operadores Booleanos (Símbolos Bitwise)
> Os operadores booleanos em sentido estrito (`and`, `or`, `not`) são palavras-chave — ver secção **Palavras > 4**. Ao nível de símbolos, os equivalentes booleanos bit a bit são:

* `&` (AND bit a bit)
* `|` (OR bit a bit)
* `^` (XOR bit a bit)
* `~` (NOT bit a bit)
* `<<` (Shift à esquerda)
* `>>` (Shift à direita)

### 4. Símbolos de Atribuição
* `=` (Atribuição simples)
* `:=` (Operador Walrus — atribuição com retorno de valor)
* `+=`, `-=`, `*=`, `/=`, `//=`, `%=`, `**=` (Atribuições aritméticas compostas)
* `&=`, `|=`, `^=`, `<<=`, `>>=` (Atribuições bitwise compostas)

### 5. Símbolos Identificadores de Tipos de Dados
* `' '` ou `" "` (Strings)
* `[ ]` (Listas)
* `{ }` (Dicionários e Conjuntos)
* `( )` (Tuplos)

### 6. Símbolo Identificador de Início de Bloco
* `:` (Usado no final de declarações para iniciar o bloco indentado)

---

## Palavras

### 1. Identificadoras de Blocos
* `if`, `elif`, `else`
* `for`, `while`
* `def`, `class`
* `try`, `except`, `finally`, `with`
* `match`, `case`

### 2. Tipos de Dados
* `int`
* `float`
* `str`
* `bool`
* `list`
* `dict`
* `set`
* `tuple`
* `None` (literal do tipo `NoneType`)
* `True`, `False` (literais booleanos do tipo `bool`)

### 3. Funções Built-in
* `print()`
* `input()`
* `len()`
* `type()`
* `range()`
* `open()`
* `sum()`
* `max()`
* `min()`

### 4. Operadores Booleanos
* `and`
* `or`
* `not`

### 5. Demais (import, from, in, as, etc.)
* **Módulos:** `import`, `from`, `as`
* **Pertença e Identidade:** `in`, `is`
* **Retorno:** `return`, `yield`
* **Funções Anónimas:** `lambda`
* **Controlo de Fluxo:** `break`, `continue`, `pass`
* **Gestão de Variáveis:** `del`, `global`, `nonlocal`
* **Testes e Erros:** `assert`, `raise`
* **Assincronismo:** `async`, `await`