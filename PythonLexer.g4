lexer grammar PythonLexer;

// 1. Operadores Aritméticos
PLUS: '+';
MINUS: '-';
STAR: '*';
DIV: '/';
FLOOR_DIV: '//';
MOD: '%';
POWER: '**';
AT: '@';

// 2. Operadores Relacionais
EQ: '==';
NOT_EQ: '!=';
GT: '>';
LT: '<';
GT_EQ: '>=';
LT_EQ: '<=';

// 3. Operadores Booleanos (Símbolos Bitwise)
AMP: '&';
PIPE: '|';
CARET: '^';
TILDE: '~';
LSHIFT: '<<';
RSHIFT: '>>';

// 4. Símbolos de Atribuição
ASSIGN: '=';
WALRUS: ':=';
PLUS_EQ: '+=';
MINUS_EQ: '-=';
STAR_EQ: '*=';
DIV_EQ: '/=';
FLOOR_DIV_EQ: '//=';
MOD_EQ: '%=';
POWER_EQ: '**=';
AMP_EQ: '&=';
PIPE_EQ: '|=';
CARET_EQ: '^=';
LSHIFT_EQ: '<<=';
RSHIFT_EQ: '>>=';

// 5. Símbolos Identificadores de Tipos de Dados
SINGLE_QUOTE: '\'';
DOUBLE_QUOTE: '"';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';
LPAREN: '(';
RPAREN: ')';

// 6. Símbolo Identificador de Início de Bloco
COLON: ':';

// PALAVRAS

// 1. Identificadoras de Blocos
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
DEF: 'def';
CLASS: 'class';
TRY: 'try';
EXCEPT: 'except';
FINALLY: 'finally';
WITH: 'with';
MATCH: 'match';
CASE: 'case';

// 2. Tipos de Dados
INT: 'int';
FLOAT: 'float';
STR: 'str';
BOOL: 'bool';
LIST: 'list';
DICT: 'dict';
SET: 'set';
TUPLE: 'tuple';
NONE: 'None';
TRUE: 'True';
FALSE: 'False';

// 3. Funções Built-in
PRINT: 'print';
INPUT: 'input';
LEN: 'len';
TYPE: 'type';
RANGE: 'range';
OPEN: 'open';
SUM: 'sum';
MAX: 'max';
MIN: 'min';

// 4. Operadores Booleanos
AND: 'and';
OR: 'or';
NOT: 'not';

// 5. Demais Palavras-Chave
IMPORT: 'import';
FROM: 'from';
AS: 'as';
IN: 'in';
IS: 'is';
RETURN: 'return';
YIELD: 'yield';
LAMBDA: 'lambda';
BREAK: 'break';
CONTINUE: 'continue';
PASS: 'pass';
DEL: 'del';
GLOBAL: 'global';
NONLOCAL: 'nonlocal';
ASSERT: 'assert';
RAISE: 'raise';
ASYNC: 'async';
AWAIT: 'await';

// LITERAIS NUMÉRICOS E STRINGS

INT_DIGIT: DIGIT+;
FLOAT_DIGIT: DIGIT+ '.' DIGIT* | '.' DIGIT+;
STRING:
	'\'' (~['\\\r\n] | '\\' .)* '\''
	| '"' (~["\\\r\n] | '\\' .)* '"';

// IDENTIFICADORES, LETRAS, DÍGITOS E WS (no final, nesta ordem)

IDENTIFIER: (LETTER | '_') (LETTER | DIGIT | '_')*;

fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];

NEWLINE: '\n';
WS: [\r\f]+ -> skip;