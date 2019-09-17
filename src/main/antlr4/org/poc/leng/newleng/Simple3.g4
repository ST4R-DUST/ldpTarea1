grammar Simple3;

program 	: start_block body+ end_block
			;

body		: declaration 
			| assign                                                      
    		| if_block                                                      
    		| read_block                                                    
    		| write_block
    		| while_block
    		;                                                   

start_block	: INIT
			; 
			                                                  
end_block	: END
			;                                                        

while_block : LPAR expr RPAR LCOR body_block RCOR
			; 
			
assign 		: VARID ASSIGN expr  
			| VARID ASSIGN (VARID | NUM)            
			;
		 
if_block	: IF expr THEN body_block (ELIF expr THEN body_block)* (ELSE THEN body_block)?  
			;
		
write_block	: WRITE LPAR (STRING | VARID+) RPAR
			;
			
read_block	: READ LPAR VARID RPAR                                    
			;
			
declaration	: var_type VARID 
			| var_type assign 
			;
			
var_type	: FLOAT_V 
			| INT_V 
			| BOOLEAN_V 
			| STRING_V 
			;
			
body_block	: body*  
			;
			
expr 		: expr_nat 
			| expr_real 
			| expr_string                         
			;

expr_real 	: LPAR expr_real op expr_real RPAR 
			| FLOAT                
			;

expr_nat 	: LPAR expr_nat op expr_nat RPAR 
			| NUM                     
			;
			
expr_string : expr_string op expr_string 
			| STRING                   
			;

op 			: PLUS 
			| MINUS 
			| MULT 
			| GT 
			| LT 
			| EQT                            
			;
                                                  


fragment INT : [0-9]			;                                                
fragment DOT: '.'    	        ;
fragment TRUE : 'true'			;
fragment FALSE: 'false'			;

//COMMENT	:  '!' .*? '\r'? '\n' -> skip	                            ;
//WS 		: [ \t\r\n]+ -> skip                                        ;

VARID:	[a-zA-Z]+	;

WRITE:  'write'         ;
READ:   'read'          ;
STRING: '"'.*?'"'		;
NUM:	INT+			;
FLOAT: 	INT DOT INT  	;
BOOLEAN: TRUE | FALSE	;
FLOAT_V: 'float'		;
INT_V: 	'int'			;
STRING_V:'str'			;
BOOLEAN_V:'boolean'		;

IF : 'if'	;
ELIF: 'elif';
ELSE: 'else';
THEN: ':'	;

GT: '>'		;
LT: '<'		;
EQT: '=='	;
ASSIGN: '<-';

INIT : 'init'	;
END : 'end'		;

LPAR: '('		;
RPAR: ')'		;

LCOR: '{'		;
RCOR: '}'		;

PLUS : '+'		;
MINUS : '-'		;
MULT : '*'		;

