package ast;
import java.io.PrintWriter;

public class CPrint extends Comando{
	public int linha;
	public Exp exp;
	
	
	public CPrint(int linha,Exp exp)
	{
	  this.linha = linha;
	  this.exp = exp;
	  
	} 
	public void geraCodigo(PrintWriter out) {
        out.print("printf(\"%f\\n\", ");
        exp.geraCodigo(out);
        out.println(");");
    }

}
