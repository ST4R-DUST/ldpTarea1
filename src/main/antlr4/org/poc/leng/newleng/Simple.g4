//grammar Simple;

//r  : 'hello' VARID ;         // match keyword hello followed by an VARIDentifier

//VARID : [a-z]+ ;             // match lower-case VARIDentifiers

//WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

grammar Simple;


//s 		: operation EOF					
//		;

program	: start_block stat+	end_block	
		;

stat		: declaration
			| assign
    		| operation
    		| if_block
    		| read_block
    		| write_block 
    		;

start_block : INIT	
			;

end_block	: END		
			;

operation  	: operation PLUS operation 				# plus
            | operation ( EQUAL | NQUAL ) operation 	# comp
            | operation AND operation 				# and
            | operation OR operation 				# or
            | operation GT operation 				# comp
            | VARID 								# id
            | LPAR operation RPAR 					# parens
            ;


if_block		: IF_RW condition_block 
			  (ELIF_RW condition_block)* 
			  (ELSE_RW else_block)? 
			  ENDIF_RW
			;

condition_block	: LPAR operation RPAR LBRACE block RBRACE
				| LPAR operation RPAR stat
				;

else_block	: LBRACE block RBRACE
            | stat
			;

block		: stat* 
			;

assign 		: VARID ASSIGN 
			( operation
			| VARID 
			| NUMBER 
			| FLOAT 
			| STRING 
			| BOOLEAN
			) ; 

var_type	: INTEGER_RW
				| REAL_RW 
				| STRING_RW
				| BOOLEAN_RW
				;

declaration		: var_type VARID
				| var_type assign  
				;

read_block: READ_RW LPAR VARID RPAR # read;

write_block: WRITE_RW LPAR (STRING | VARID+) RPAR # write;


fragment TRUE	: 'v'		;
fragment FALSE	: 'f'		;
fragment NAT		: [0-9]		;
fragment DOT		: '.'		;
 
PLUS 	: '+'	;
MINUS	: '-'	;
AND		: 'and'	;
OR		: 'or'	;
EQUAL	: '='	;
NQUAL	: '<>'	;
GT		: '>'	;
ASSIGN 	: '<-'	;
LPAR		: '('	;
RPAR		: ')'	;
LBRACE	: '{'	;
RBRACE	: '}'	;

INIT		: 'init'	;
END		: 'end'		;
IF_RW		: 'si'		;
ELIF_RW		: 'sino_si'	;
ELSE_RW		: 'sino'		;
ENDIF_RW		: 'fin_si'	;
READ_RW		: 'leer'		;
WRITE_RW		: 'escribir'	;
INTEGER_RW	: 'entero'	;
STRING_RW	: 'cadena'	;
REAL_RW		: 'real'		;
BOOLEAN_RW	: 'logico'	;

NUMBER	: NAT+				;
FLOAT 	: NUMBER DOT NUMBER	;
BOOLEAN 	: TRUE | FALSE		;
STRING 	: '"' .*? '"'		;

VARID		: [a-zA-Z]+						;
COMMENT	:  '!' .*? '\r'? '\n' -> skip	;
WS 		: [ \t\r\n]+ -> skip 			;