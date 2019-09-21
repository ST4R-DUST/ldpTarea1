grammar Simple;

program		: start_block stat+	end_block	
			;

stat		: declaration
			| assign
    		| operation
    		| if_block
    		| read_block
    		| write_block 
    		| while_block
    		;

start_block : INIT	
			;

end_block	: END		
			;

operation  	: operation PLUS operation 				# plus
			| operation MINUS operation				# minus
			| operation MULTIPLY operation			# multiply
			| operation DIVIDE operation			# divide
            | operation EQUAL operation        		# comp	
            | VARID 								# id
            | NUMBER								# num
            | BOOLEAN								# boolean
            | LPAR operation RPAR 					# parens
            ;
            
condOperation	: operation EQUAL EQUAL operation	
				| operation NQUAL operation			
				| operation GT EQUAL operation		
				| operation LT EQUAL operation		
				| operation GT operation			
				| operation LT operation			
				| condOperation AND condOperation 	
            	| condOperation OR condOperation 	
            	| LPAR condOperation RPAR 
            	| VARID			
				;


if_block	: IF condition_block (ELIF condition_block)* (ELSE else_block)? ENDIF
			;

while_block : WHILE condition_block
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
			| BOOLEAN_V
			;

declaration		: var_type VARID
				;



read_block: READ LPAR VARID RPAR # read;

write_block: WRITE LPAR (STRING | VARID+) RPAR # write;


fragment TRUE	: 'true'		;
fragment FALSE	: 'false'	;
fragment NAT	: [0-9]		;
 
PLUS 	: '+'	;
MINUS	: '-'	;
MULTIPLY: '*'	;
DIVIDE	: '/'	;
DOT		: '.'	;
AND		: ' && ';
OR		: ' || ';
EQUAL	: '='	;
NQUAL	: '<>'	;
GT		: '>'	;
LT		: '<'	;
ASSIGN 	: '<-'	;
LPAR	: '('	;
RPAR	: ')'	;
LBRACE	: '{'	;
RBRACE	: '}'	;

INIT		: 'init'	;
END			: 'end'		;
IF			: 'if'		;
ELIF		: 'elif'	;
ELSE		: 'else'	;
ENDIF		: 'fi'		;
WHILE		: 'while'	;
READ		: 'read'	;
WRITE		: 'write'	;
INT_V		: 'int'		;
FLOAT_V		: 'float'	;
BOOLEAN_V	: 'bool'	;

NUMBER	: NAT+				;
FLOAT 	: NUMBER DOT NUMBER	;
BOOLEAN 	: TRUE | FALSE	;
STRING 	: '"' .*? '"'		;

VARID		: [a-zA-Z]+					;
COMMENT	:  '!' .*? '\r'? '\n' -> skip	;
WS 		: [ \t\r\n]+ -> skip 			;