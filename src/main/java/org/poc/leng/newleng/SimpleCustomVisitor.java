package org.poc.leng.newleng;

import java.util.HashMap;
import java.util.Map;

public class SimpleCustomVisitor extends SimpleBaseVisitor<Object>{

	protected Map<String, String> _vars = new HashMap<String, String>();

	public SimpleCustomVisitor() {}
//
	@Override
    public Object visitStart_block(SimpleParser.Start_blockContext ctx) { 
	    	if(ctx.INIT().getText().equals("init"))    {
	    	System.out.println("#include <stdio.h>");
			System.out.println("");
			System.out.println("int main(void)\n{");
		}
	    return null;
	}
//	
	@Override
	public Object visitEnd_block(SimpleParser.End_blockContext ctx) {
	    	if(ctx.END().getText().equals("end"))    {
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
	@Override
	public Object visitPlus(SimpleParser.PlusContext ctx) 
	{
		return null;
	}
	@Override
	public Object visitAssign(SimpleParser.AssignContext ctx) 
	{
		System.out.print("\t"+ctx.VARID(0).getText()+" = ");    
		SimpleParser.OperationContext subCtx = ctx.operation();
		System.out.println(subCtx.getText()+";");
		return null;
	}
	@Override
	public Object visitIf_block(SimpleParser.If_blockContext ctx)
	{
		SimpleParser.Condition_blockContext condCTX = ctx.condition_block(0);
		SimpleParser.BlockContext blockCTX = condCTX.block();
		System.out.println("\tif("+condCTX.condOperation().getText()+")");
		System.out.println("\t{");
		for(int i = 0; i < blockCTX.stat().size();i++)
		{
			System.out.print("\t");
			visit(blockCTX.stat(i));
		}
		System.out.println("\t}");
		if(!ctx.ELIF().isEmpty())
		{
			for(int j = 1; j <= ctx.ELIF().size();j++) //Por alguna razón, esta es la manera correcta de definir esto
			{
				condCTX = ctx.condition_block(j);
				blockCTX = condCTX.block();
				System.out.println("\telse if("+condCTX.condOperation().getText()+")\n\t{");
				for(int i = 0; i < blockCTX.stat().size();i++)
				{
					System.out.print("\t");
					visit(blockCTX.stat(i));
				}
				System.out.println("\t}");
			}
			
		}
		if(ctx.ELSE()!=null)
		{
			SimpleParser.Else_blockContext elseCTX = ctx.else_block();
			blockCTX = elseCTX.block();
			System.out.println("\telse\n\t{");
			for(int i = 0; i < blockCTX.stat().size();i++)
			{
				System.out.print("\t");
				visit(blockCTX.stat(i));
			}
			System.out.println("\t}");
		}
		
		return null;
	}
	@Override
	public Object visitRead(SimpleParser.ReadContext ctx) 
	{
		String id = ctx.VARID().getText();
		if (_vars.containsKey(id)) {
			System.out.println(String.format("\tscanf(\"%s\", &%s);", getVarTypeMode(_vars.get(id)), id));
		} else {
    			throw new IllegalArgumentException("Variable '" + id + "' doesn't defined");
		}
		return null; 
	}
	
	@Override
	public Object visitWrite(SimpleParser.WriteContext ctx) {
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
	@Override
	public Object visitWhile_block(SimpleParser.While_blockContext ctx)
	{
		SimpleParser.Condition_blockContext condCTX = ctx.condition_block();
		SimpleParser.BlockContext blockCTX = condCTX.block();
		System.out.println("\twhile("+condCTX.condOperation().getText()+")");
		System.out.println("\t{");
		for(int i = 0; i < blockCTX.stat().size();i++)
		{
			System.out.print("\t");
			visit(blockCTX.stat(i));
		}
		System.out.println("\t}");
		return null;
	}
	private String getVarType(String var_type) {
		if(var_type.equals("int") || var_type.equals("bool"))
			return "int";
		else if(var_type.equals("float"))
			return "float";
		else
			return "String";
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
