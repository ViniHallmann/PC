package ast;
import java.io.PrintWriter;

public class ParamFormalFun{
   public String type;
   public String var;
   
   public ParamFormalFun(String type,String var){
   	this.type = type;
   	this.var  = var;
   }
   public void geraCodigo(PrintWriter out) {
      String tipoC;
      if (type.equals("float")) {
         tipoC = "float";
       } else if (type.equals("bool")) {
         tipoC = "bool";
       } else if (type.equals("int")) {
         tipoC = "int";
       } else {
         tipoC = type; 
       }
      out.print(tipoC + " " + var);
   }
}
