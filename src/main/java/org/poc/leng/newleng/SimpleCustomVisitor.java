package org.poc.leng.newleng;

import java.util.HashMap;
import java.util.Map;

public class SimpleCustomVisitor extends SimpleBaseVisitor<Object>{

	protected Map<String, String> _vars = new HashMap<String, String>();

	public SimpleCustomVisitor() {}
//
	@Override
    public Object visitStart_block(SimpleParser.Start_blockContext ctx) { 
	    	if(ctx.INIT().getText().equals("inicio"))    {
	    	System.out.println("#include <stdio.h>");
			System.out.println("");
			System.out.println("int main(void) {");
		}
	    return null;
	}
//	
	@Override
	public Object visitEnd_block(SimpleParser.End_blockContext ctx) {
	    	if(ctx.END().getText().equals("fin"))    {
	    		System.out.println("\treturn 0;");
	    		System.out.println("}");
	    	}
	    return null;
	}
//	
	@Override
	public Object visitDeclaration(SimpleParser.DeclarationContext ctx) {
		String var_type = ctx.var_type().getText();
        String id = ctx.VARID().getText();

        if (!_vars.containsKey(id)) {
        		var_type = getVarType(var_type);
        		_vars.put(id, var_type);
        		System.out.println(String.format("\t%s %s;", var_type, id));
        } else {
        		throw new IllegalArgumentException("Variable '" + id + "' ya existe!!");
        }
        
		return null;
	}
	/*@Override
	public Object visitPlus(SimpleParser.PlusContext ctx) 
	{
		String suma = ctx.PLUS().getText();
		System.out.println("\t"+ctx.getText()+";");
		ctx.
		return null;
	}*/
	/*@Override
	public Object visitPrint(SimpleParser.PrintContext ctx) 
	{
		String texto="";
		if(!ctx.STRING().getText().isEmpty())
		{
			texto = ctx.STRING().getText();
			System.out.println("\tprintf("+texto+");");
		}
	    return null;
	}*/
//
//	@Override
//	public Object visitRead(SimpleParser.ReadContext ctx) {
//		String id = ctx.ID().getText();
//		if (_vars.containsKey(id)) {
//			System.out.println(String.format("\tscanf(\"%s\", &%s);", getVarTypeMode(_vars.get(id)), id));
//		} else {
//    			throw new IllegalArgumentException("Variable '" + id + "' doesn't defined");
//		}
//		return null; 
//	}
//	
	@Override
	public Object visitWrite_block(SimpleParser.Write_blockContext ctx) {
		if (ctx.VARID().size() > 0) {
			String id, format = "", args = "";
			for (int i = 0; i < ctx.VARID().size(); i++) {
				id = ctx.VARID(i).getText();
				if (_vars.containsKey(id)) {
					format += getVarTypeMode(_vars.get(id)) + " ";
					args += id + ", ";
				} else {
	    				throw new IllegalArgumentException("Variable '" + id + "' doesn't defined");
				}
			}
			System.out.println(String.format("\tprintf(\"%s\", %s);", format.substring(0, format.length() - 1), args.substring(0, args.length() - 2)));
		} else {
			String text = ctx.STRING().getText();
			if(text != null) {
				System.out.println(String.format("\tprintf(%s);", text));
			}
		}
		return null;  
	}
	
//	@Override
//	public Object visitIf_block(SimpleParser.If_blockContext ctx) {
//		// Completar
//		return null; 
//	}
//	
	private String getVarType(String var_type) {
		if(var_type.equals("entero") || var_type.equals("logico"))
			return "int";
		else if(var_type.equals("real"))
			return "float";
		else
			return "char";
	}
//	
	private String getVarTypeMode(String var_type) {
		if(var_type.equals("int"))
			return "%d";
		else if(var_type.equals("real"))
			return "%f";
		else
			return "%s";
	}
	
//	private String replace(String stat) {
//		stat.replace("=", "==");
//		stat.replace("<>", "!=");
//		stat.replace("AND", "&&");
//		stat.replace("OR", "&&");
//		return stat;
//	}
//	
	
}
