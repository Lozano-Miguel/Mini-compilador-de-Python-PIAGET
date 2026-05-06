parser grammar PythonParser;

options {
	tokenVocab = PythonLexer;
}

// Regra inicial: zero ou mais statements seguidos de fim de ficheiro
code: stat* EOF;

// Cada statement é uma expressão seguida de nova linha
stat: expr NEWLINE;

// Expressões possíveis
expr:
	expressoesEntreParenteses // expressões agrupadas entre parênteses
	| expr (PLUS | MINUS | STAR | DIV | FLOOR_DIV | MOD | POWER) expr // operacoesComExpressoes
	| numeros // números (inteiros e decimais)
	| ids ; // identificadores

// Identificadores
ids: IDENTIFIER;

// Números: inteiros ou decimais
numeros: INT_DIGIT | FLOAT_DIGIT;

// Expressões entre parênteses
expressoesEntreParenteses: LPAREN expr RPAREN;
