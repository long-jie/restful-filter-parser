grammar RestFilter;

@header {
    package org.capybara.restful.filter.paser;
}

// Parser rules
filter  :   expr
        ;

expr    : field operator value              # BinaryExpr
        | expr logicOperator expr           # LogicExpr
        | '(' expr ')'                      # ParenthesesExpr
        ;

field   : IDENTIFIER
        ;

value   : STRING
        | NUMBER
        | BOOLEAN
        | NULL
        | '(' value (',' value)* ')'
        ;

operator: OPERATOR
        ;

logicOperator: AND | OR;

// Lexer rules
OPERATOR    : [eE][qQ] | [nN][qQ] | [gG][tT] | [gG][tT][eE] | [lL][tT] | [lL][tT][eE] | [cC][sS] | [bB][gG] | [iI][nN] | [nN][iI];
BOOLEAN     : 'true' | 'false' | 'TRUE' | 'FALSE';
AND         : 'AND' | 'and';
OR          : 'OR' | 'or';
NULL        : 'null';
STRING      : '\'' (~['\r\n] | '\\' '\'')* '\'';
NUMBER      : [+-]?[0-9]+('.'[0-9]+)?([eE][+-]?[0-9]+)?;
IDENTIFIER  : [a-zA-Z_][a-zA-Z0-9_]*;
WS          : [ \t\r\n]+ -> skip;