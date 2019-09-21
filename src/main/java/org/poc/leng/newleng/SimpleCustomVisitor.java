package org.poc.leng.newleng;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SimpleCustomVisitor extends SimpleBaseVisitor<Object>{
	
	public MyConfig mc = new MyConfig();

	protected Map<String, String> _vars = new HashMap<String, String>();

	public SimpleCustomVisitor() {}
	
//
	
	@Override
    public Object visitStart_block(SimpleParser.Start_blockContext ctx) { 
		
	    	if(ctx.INIT().getText().equals("init"))
	    	{
	    	mc.mycode = mc.mycode + "\n#include <stdio.h>\n#include <stdbool.h>\nint main(void)\n{";
	    	System.out.println("\n#include <stdio.h>\n#include <stdbool.h>\nint main(void)\n{\n");

		}
	    return null;
	}
//	
	@Override
	public Object visitEnd_block(SimpleParser.End_blockContext ctx) {

	    	if(ctx.END().getText().equals("end"))    {
 	    		System.out.println("\treturn 0;\n}");
 	    		mc.mycode=mc.mycode+"\treturn 0;\n}\n";
 	    		System.out.println(mc.mycode);
 	    		   File f = new File(MyConfig.ruta);
 	    		   BufferedWriter writer;
				try {
					writer = new BufferedWriter(new FileWriter(f));
					writer.write(mc.mycode);
	    		    writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
 	    		   
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
        		mc.mycode=mc.mycode+String.format("\t%s %s;\n", var_type, id);
        		
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
		mc.mycode=mc.mycode+"\t"+ctx.VARID(0).getText()+" = ";
		SimpleParser.OperationContext subCtx = ctx.operation();
		System.out.println(subCtx.getText()+";");
		mc.mycode=mc.mycode+subCtx.getText()+";\n";
		
		return null;
	}
	@Override
	public Object visitIf_block(SimpleParser.If_blockContext ctx)
	{
		SimpleParser.Condition_blockContext condCTX = ctx.condition_block(0);
		SimpleParser.BlockContext blockCTX = condCTX.block();
		System.out.println("\tif("+replaceNot(condCTX.condOperation().getText())+")");
		mc.mycode=mc.mycode+"\tif("+replaceNot(condCTX.condOperation().getText())+")\n";
		System.out.println("\t{");
		mc.mycode=mc.mycode+"\t{\n";
		
		for(int i = 0; i < blockCTX.stat().size();i++)
		{
			System.out.print("\t");
			mc.mycode=mc.mycode+"\t\n";
			visit(blockCTX.stat(i));
		}
		System.out.println("\t}");
		mc.mycode=mc.mycode+"\t}\n";
		if(!ctx.ELIF().isEmpty())
		{
			for(int j = 1; j <= ctx.ELIF().size();j++) //Por alguna razón, esta es la manera correcta de definir esto
			{
				condCTX = ctx.condition_block(j);
				blockCTX = condCTX.block();
				System.out.println("\telse if("+replaceNot(condCTX.condOperation().getText())+")\n\t{");
				mc.mycode=mc.mycode+"\telse if("+replaceNot(condCTX.condOperation().getText())+")\n\t{\n";
				for(int i = 0; i < blockCTX.stat().size();i++)
				{
					System.out.print("\t");
					mc.mycode=mc.mycode+"\t\n";
					visit(blockCTX.stat(i));
				}
				System.out.println("\t}");
				mc.mycode=mc.mycode+"\t}\n";
			}
			
		}
		if(ctx.ELSE()!=null)
		{
			SimpleParser.Else_blockContext elseCTX = ctx.else_block();
			blockCTX = elseCTX.block();
			System.out.println("\telse\n\t{");
			mc.mycode=mc.mycode+"\telse\n\t{\n";
			for(int i = 0; i < blockCTX.stat().size();i++)
			{
				System.out.print("\t");
				mc.mycode=mc.mycode+"\t\n";
				visit(blockCTX.stat(i));
			}
			System.out.println("\t}");
			mc.mycode=mc.mycode+"\t}\n";
		}
		
		return null;
	}
	@Override
	public Object visitRead(SimpleParser.ReadContext ctx) 
	{
		String id = ctx.VARID().getText();
		if (_vars.containsKey(id)) {
			System.out.println(String.format("\tscanf(\"%s\", &%s);", getVarTypeMode(_vars.get(id)), id));
			mc.mycode=mc.mycode+String.format("\tscanf(\"%s\", &%s);", getVarTypeMode(_vars.get(id)), id)+"\n";
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
			mc.mycode=mc.mycode+String.format("\tprintf(\"%s\", %s);", format.substring(0, format.length() - 1), args.substring(0, args.length() - 2))+"\n";
		} else {
			String text = ctx.STRING().getText();
			if(text != null) {
				System.out.println(String.format("\tprintf(%s);", text));
				mc.mycode=mc.mycode+String.format("\tprintf(%s);", text)+"\n";
			}
		}
		return null;  
	}
	@Override
	public Object visitWhile_block(SimpleParser.While_blockContext ctx)
	{
		SimpleParser.Condition_blockContext condCTX = ctx.condition_block();
		SimpleParser.BlockContext blockCTX = condCTX.block();
		System.out.println("\twhile("+replaceNot(condCTX.condOperation().getText())+")");
		mc.mycode=mc.mycode+"\twhile("+replaceNot(condCTX.condOperation().getText())+")\n";
		System.out.println("\t{");
		mc.mycode=mc.mycode+"\t{\n";
		
		for(int i = 0; i < blockCTX.stat().size();i++)
		{
			System.out.print("\t");
			mc.mycode=mc.mycode+"\t\n";
			visit(blockCTX.stat(i));
		}
		System.out.println("\t}");
		mc.mycode=mc.mycode+"\t}";
		return null;
	}
	private String getVarType(String var_type) {
		if(var_type.equals("int"))
			return "int";
		else if(var_type.equals("float"))
			return "float";
		else
			return "bool";
	}
	
	private String getVarTypeMode(String var_type) {
		if(var_type.equals("int"))
			return "%d";
		else if(var_type.equals("float"))
			return "%f";
		else
			return "null";
	}

	private String replaceNot(String condText) //Solución a fuerza bruta
	{
		for(int i = 0;i<condText.length();i++)
		{
			if(condText.charAt(i) == '<' && i+1 < condText.length())
			{
					if(condText.charAt(i+1) == '>')
					{
						char[] aux = condText.toCharArray();
						aux[i] = '!';
						aux[i+1] = '=';
						condText = String.valueOf(aux);
					}
			}
		}
		return condText;
	}
	
}
