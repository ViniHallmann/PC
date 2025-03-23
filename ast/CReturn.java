package ast;
import java.io.PrintWriter;

public class CReturn extends Comando{
	public int linha;
	public Exp exp;
	
	
	public CReturn(int linha,Exp exp)
	{
	  this.linha = linha;
	  this.exp = exp;
	  
	}
	public void geraCodigo(PrintWriter out) {
		out.print("return ");
		exp.geraCodigo(out);
		out.println(";");
	}

}
