grammar calculator;

program
	:	statements[0]
		{System.out.println($statements.value);}
	;

statements [int tab] returns [String value]
@init{
	value = null;
}
	: 	statement[$tab] a=statements[$tab]
		{$value = $statement.value + $a.value;}
	|	{$value = "";}
	;
	
statement [int tab] returns [String value]
@init{
	value = null;
}
	:	type[$tab] func_or_var[$tab]
		{$value = $func_or_var.value + "\n";}
	|	'#include' '<' ID '>'
		{$value = "";}
	|	'using' 'namespace' ID ';'
		{$value = "";}
	|	COMMENT
		{$value = ""; for(int i = 0; i < $tab; i++) $value += "\t"; $value += $COMMENT.text;}
	;

func_or_var [int tab] returns [String value]
@init{
	value = null;
}
	:	dec_func[$tab]
		{$value = ""; for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += "function " + $dec_func.value;}
	|	dec_var[$tab]
		{$value = ""; for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += "var " + $dec_var.value;}
	;

dec_func [int tab] returns [String value]
@init{
	value = null;
}
	:	dec_func_name[$tab] '{' func_implement[$tab + 1] '}' semi_colon[$tab]
		{$value = $dec_func_name.value + "\n";
		 for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += "{\n" + $func_implement.value;
		 for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += "}" + $semi_colon.value + "\n";}
	;

dec_func_name [int tab] returns [String value]
@init{
	value = null;
}
	:	ID '(' dec_param[$tab] ')'
		{$value = $ID.text + "(" + $dec_param.value + ")";}
	;

dec_param [int tab] returns [String value]
@init{
	value = null;
}
	:	type[$tab] ID dec_param_[$tab]
		{$value = $ID.text + $dec_param_.value;}
	|	{$value = "";}
	;

dec_param_ [int tab] returns [String value]
@init{
	value = null;
}
	:	','  dec_param[$tab]
		{$value = ", " + $dec_param.value;}
	|	{$value = "";}
	;

func_implement [int tab] returns [String value]
@init{
	value = null;
}
	:	block[$tab]
		{$value = $block.value;}
	;

dec_var [int tab] returns [String value]
@init{
	value = null;
}	
	:	ID dec_array[$tab] ';'
		{$value = $ID.text + " = new Array(" + $dec_array.value + ");";}
	|   ID dec_array[$tab] '=' array_value[$tab] ';'
		{$value = $ID.text + " = new Array(" + $array_value.value + ");";}
	|	ID dec_expression[$tab] dec_var_[$tab]
		{$value = $ID.text + $dec_expression.value + $dec_var_.value;}
	;

dec_var_ [int tab] returns [String value]
@init{
	value = null;
}
	:	';'
		{$value = ";";}
	|	',' dec_var[$tab]
		{$value = ", " + $dec_var.value;}	
	;

dec_array [int tab] returns [String value]
@init{
	value = null;
}	
	:  '[' INT ']'
		{$value = $INT.text;}
	;

array_value [int tab] returns [String value]
	:	'{' INT ints[$tab] '}'
		{$value = $INT.text + $ints.value;}
	;

dec_expression [int tab] returns [String value]
@init{
	value = null;
}
	:	'=' expr_value[$tab]
		{$value = " = " + $expr_value.value;}
	|	{$value = "";}
	;

block [int tab] returns [String value]
@init{
	value = null;
}
	:	stat[$tab] a=block[$tab]
		{$value = $stat.value + $a.value;}
	|	{$value = "";}
	;

stat [int tab] returns [String value]
@init{
	value = null;
}
	:	type[$tab] dec_var[$tab]
		{$value = ""; for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += $type.value + " " + $dec_var.value + "\n";}
	|	ie_stat[$tab]
		{$value = ""; for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += $ie_stat.value;}
	|	for_stat[$tab]
		{$value = ""; for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += $for_stat.value;}
	|	while_stat[$tab]
		{$value = ""; for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += $while_stat.value;}
	| 	switch_stat[$tab]
		{$value = ""; for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += $switch_stat.value;}	
	|	call_function[$tab] ';'
		{$value = ""; for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += $call_function.value + ";\n";}
	|	'return' return_sentence[$tab] ';'
		{$value = ""; for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += "return " + $return_sentence.value + ";\n";}
	|	'break' ';'
		{$value = ""; for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += "break;\n";}
	|	normal_exp[$tab] ';'
		{$value = ""; for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += $normal_exp.value + ";\n";}
	|	'cin' input[$tab] ';'
		{$value = $input.value;}
	|	'cout' outputs[$tab] ';'
		{$value = $outputs.value;}
	|	COMMENT
		{$value = ""; for(int i = 0; i < $tab; i++) $value += "\t"; $value += $COMMENT.text;}
	;

ie_stat [int tab] returns [String value]
@init{
	value = null;
}
	:	if_stat[$tab] else_stat[$tab]
		{$value = $if_stat.value + $else_stat.value;}
	;

if_stat [int tab] returns [String value]
@init{
	value = null;
}
	:	'if' '(' expr_value[$tab] ')' '{' block[$tab + 1] '}'
		{$value = "if(" + $expr_value.value + ")\n";
		 for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += "{\n" + $block.value;
		 for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += "}\n";}
	;
	
else_stat_ [int tab] returns [String value]
@init{
	value = null;
}
	:	'{' block[$tab + 1] '}'
		{$value = "\n"; for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += "{\n" + $block.value;
		 for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += "}\n";}
	|	ie_stat[$tab]
		{$value = " " + $ie_stat.value;}
	;

else_stat [int tab] returns [String value]
@init{
	value = null;
}
	:	'else' else_stat_[$tab]
		{$value = ""; for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += "else" + $else_stat_.value;}
	|	{$value = "";}
	;

for_stat [int tab] returns [String value]
@init{
	value = null;
}
	:	'for' '(' for_para[$tab] ';' expr[$tab] ';' normal_exp[$tab] ')' '{' block[$tab + 1] '}'
		{$value = "for(" + $for_para.value + "; " + $expr.value + "; " + $normal_exp.value + ")\n";
		 for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += "{\n" + $block.value;
		 for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += "}\n";}
	;

for_para [int tab] returns [String value]
@init{
	value = null;
}
	:	dec_expression[$tab]
		{$value = $dec_expression.value;}
	|	normal_exp[$tab]
		{$value = $normal_exp.value;}
	|	type[$tab] normal_exp[$tab]
		{$value = $type.value + " " + $normal_exp.value;}
	;

while_stat [int tab] returns [String value]
@init{
	value = null;
}
	:	'while' '(' expr[$tab] ')' '{' block[$tab + 1] '}'
		{$value = "while(" + $expr.value + ")\n";
		 for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += "{\n" + $block.value;
		 for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += "}\n";}
	;

switch_stat [int tab] returns [String value]
@init{
	value = null;
}
	:	'switch' '(' ID array[$tab] ')' '{' case_stats[$tab + 1] default_stat[$tab + 1] '}'
		{$value = "switch(" + $ID.text + $array.value + ")\n";
		 for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += "{\n" + $case_stats.value + $default_stat.value;
		 for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += "}\n";}
	;

case_stats [int tab] returns [String value]
@init{
	value = null;
}
	:	case_stat[$tab] a=case_stats[$tab]
		{$value = $case_stat.value + $a.value;}
	|	{$value = "";}
	;

case_stat [int tab] returns [String value]
@init{
	value = null;
}
	:	'case' CHAR ':' block[$tab + 1]
		{$value = ""; for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += "case " + $CHAR.text + " :\n" + $block.value;}
	;

default_stat [int tab] returns [String value]
@init{
	value = null;
}
	:   'default' ':' block[$tab + 1]
		{$value = ""; for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += "default :\n" + $block.value;}
	|	{$value = "";}
	;

input [int tab] returns [String value]
@init{
	value = null;
}
	:	'>>' ID a=input[$tab]
		{$value = ""; for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += $ID.text + " = window.prompt() + '\\0';\n" + $a.value;}
	|   {$value = "";}
	;

outputs [int tab] returns [String value]
@init{
	value = null;
}
	:	'<<' output[$tab] a=outputs[$tab]
		{$value = $output.value + $a.value;}
	|	{$value = "";}
	;

output [int tab] returns [String value]
@init{
	value = null;
}
	:	ID
		{$value = ""; for(int i = 0; i < $tab; i++) $value += "\t";
		 $value += "console.log(" + $ID.text + ");\n";}
	|   'endl'
	    {$value = ""; for(int i = 0; i < $tab; i++) $value += "\t";
	     $value += "console.log('\\n');\n";}
	;

call_function [int tab] returns [String value]
@init{
	value = null;
}
	:	ID '(' call_parameter[$tab] ')'
		{$value = $ID.text + "(" + $call_parameter.value + ")";}
	;

call_parameter [int tab] returns [String value]
@init{
	value = null;
}
	:	expr_value[$tab] call_parameter_[$tab]
		{$value = $expr_value.value + $call_parameter_.value;}
	|	{$value = "";}
	;

call_parameter_ [int tab] returns [String value]
@init{
	value = null;
}
	:	',' call_parameter[$tab]
		{$value = ", " + $call_parameter.value;}
	|	{$value = "";}
	;

array [int tab] returns [String value]
@init{
	value = null;
}
	:	'[' index[$tab] ']'
		{$value = "[" + $index.value + "]";}
	|	{$value = "";}
	;

index [int tab] returns [String value]
@init{
	value = null;
}
	:	expr_value[$tab]
		{$value = $expr_value.value;}
	|	{$value = "";}
	;

semi_colon [int tab] returns [String value]
@init{
	value = null;
}
	:	';'
		{$value = ";";}
	|	{$value = "";}
	;

expr_value [int tab] returns [String value]
@init{
	value = null;
}
	:	expr[$tab]
		{$value = $expr.value;}
	|	'!' expr[$tab]
		{$value = "!" + $expr.value;}
	|	'-' expr[$tab]
		{$value = "-" + $expr.value;}
	;

expr [int tab] returns [String value]
@init{
	value = null;
}
	:	operand[$tab] expr_[$tab]
		{$value = $operand.value + $expr_.value;}
	;

operand [int tab] returns [String value]
@init{
	value = null;
}
	:	ID array[$tab]
		{$value = $ID.text + $array.value;}
	|	INT
		{$value = $INT.text;}
	|   CHAR
		{$value = $CHAR.text;}
	|	'(' expr[$tab] ')'
		{$value = "(" + $expr.value + ")";}
	|	call_function[$tab]
		{$value = $call_function.value;}
	|	object[$tab]
		{$value = $object.value;}
	;

expr_ [int tab] returns [String value]
@init{
	value = null;
}
	:	binary_operator[$tab] expr[$tab]
		{$value = $binary_operator.value + $expr.value;}
	|	unary_operator[$tab]
		{$value = $unary_operator.value;}
	|	{$value = "";}
	;

object [int tab] returns [String value]
@init{
	value = null;
}
	:	a=ID '.' b=ID
		{$value = $a.text + "." + $b.text;}
	;

return_sentence [int tab] returns [String value]
@init{
	value = null;
}
	:	expr_value[$tab]
		{$value = $expr_value.value;}
	|	{$value = "";}
	;

normal_exp [int tab] returns [String value]
@init{
	value = null;
}
	:	normal_give_value[$tab] expr_[$tab]
		{$value = $normal_give_value.value + $expr_.value;}
	;

normal_give_value [int tab] returns [String value]
@init{
	value = null;
}
	:	ID array[$tab]
		{$value = $ID.text + $array.value;}
	|	object[$tab]
		{$value = $object.value;}
	;

binary_operator [int tab] returns [String value]
@init{
	value = null;
}
	:	'+'
		{$value = " + ";}
	|	'-'
		{$value = " - ";}
	|	'*'
		{$value = " * ";}
	|	'/'
		{$value = " / ";}
	|	'%'
		{$value = " \% ";}
	|	'^'
		{$value = " ^ ";}
	|	'&'
		{$value = " & ";}
	|	'&&'
		{$value = " && ";}
	|	'||'
		{$value = " || ";}
	|	'+='
		{$value = " += ";}
	|	'-='
		{$value = " -= ";}
	|	'*='
		{$value = " *= ";}
	|	'/='
		{$value = " /= ";}
	|	'%='
		{$value = " \%= ";}
	|	'^='
		{$value = " ^= ";}
	|	'&='
		{$value = " &= ";}
	|	'='
		{$value = " = ";}
	|	'>'
		{$value = " > ";}
	|	'>='
		{$value = " >= ";}
	|	'=='
		{$value = " == ";}
	|	'<'
		{$value = " < ";}
	|	'<='
		{$value = " <= ";}
	|	'!='
		{$value = " != ";}
	;

unary_operator [int tab] returns [String value]
@init{
	value = null;
}
	:	'++'
		{$value = "++";}
	|	'--'
		{$value = "--";}
	;

ints [int tab] returns [String value]
@init{
	value = null;
}
    :   ',' INT a=ints[$tab]
    	{$value = ", " + $INT.text + $a.value;}
    |	{$value = "";}
    ; 

type [int tab] returns [String value]
@init{
	value = null;
}
	:	'int'
		{$value = "var";}
	|	'char'
		{$value = "var";}
	|	'double'
		{$value = "var";}
	|	'void'
		{$value = "var";}
	|	'int*'
		{$value = "var";}
	|	'double*'
		{$value = "var";}
	|	'string'
		{$value = "var";}
	|	'char*'
		{$value = "var";}
	|	'int&'
		{$value = "int&";}
	;

ID  :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'-'?('0'..'9')('0'..'9')*
    ;

CHAR:	'\'' . * '\''
    ;

COMMENT 
    :	'/*' . * '*/'
    |	'//' ~ ('\n' | '\r') * '\r'? '\n'
    ;

WS  :   (   ' '
        |   '\t'
        |   '\r'
        |   '\n'
        )+
        { $channel=HIDDEN; }
    ;