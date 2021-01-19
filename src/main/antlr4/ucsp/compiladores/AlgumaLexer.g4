lexer grammar AlgumaLexer;

Letra : 'a'..'z' | 'A'..'Z';
Digito : '0'..'9';
Variable : Letra(Letra|Digito)* { System.out.print("[Var,"+getText()+"]"); };