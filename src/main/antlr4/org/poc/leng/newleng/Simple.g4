grammar Simple;

program		: start_block stat+	end_block	
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
			| operation MINUS operation				# minus
            | operation ( EQUAL | NQUAL ) operation # comp
            | operation AND operation 				# and
            | operation OR operation 				# or
            | operation GT operation 				# comp
            | VARID 								# id
            | NUMBER								# num
            | LPAR operation RPAR 					# parens
            ;
            
condOperation	: operation EQUAL EQUAL operation	#equal
				| operation GT EQUAL operation		#gt
				| operation LT EQUAL operation		#lt
				;


if_block	: IF condition_block (ELIF condition_block)* (ELSE else_block)? ENDIF
			;

condition_block	: LPAR condOperation RPAR LBRACE block RBRACE
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

var_type	: INT_V
			| FLOAT_V 
			| STRING_V
			| BOOLEAN_V
			;

declaration		: var_type VARID
				| var_type assign  
				;

read_block: READ LPAR VARID RPAR # read;

write_block: WRITE LPAR (STRING | VARID+) RPAR # write;


fragment TRUE	: 'true'		;
fragment FALSE	: 'false'		;
fragment NAT	: [0-9]		;
fragment DOT	: '.'		;
 
PLUS 	: '+'	;
MINUS	: '-'	;
AND		: 'and'	;
OR		: 'or'	;
EQUAL	: '='	;
NQUAL	: '<>'	;
GT		: '>'	;
LT		: '<'	;
ASSIGN 	: '<-'	;
LPAR		: '('	;
RPAR		: ')'	;
LBRACE	: '{'	;
RBRACE	: '}'	;

INIT		: 'init'	;
END		: 'end'		;
IF		: 'if'		;
ELIF		: 'elif'	;
ELSE		: 'else'		;
ENDIF		: 'fi'	;
READ		: 'read'		;
WRITE		: 'write'	;
INT_V	: 'int'	;
STRING_V	: 'string'	;
FLOAT_V		: 'float'		;
BOOLEAN_V	: 'bool'	;

NUMBER	: NAT+				;
FLOAT 	: NUMBER DOT NUMBER	;
BOOLEAN 	: TRUE | FALSE		;
STRING 	: '"' .*? '"'		;

VARID		: [a-zA-Z]+						;
COMMENT	:  '!' .*? '\r'? '\n' -> skip	;
WS 		: [ \t\r\n]+ -> skip 			;