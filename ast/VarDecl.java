package ast;

public class VarDecl{
   public String type;
   public String var;
   
   public VarDecl(String type,String var){
   	this.type = type;
   	this.var = var;
   }

   public void geraCodigo(){
   	System.out.println(type + " " + var + ";");
   }
}
