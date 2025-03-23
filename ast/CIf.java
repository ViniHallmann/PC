package ast;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CIf extends Comando{
	public int linha;
	public Exp exp;
	public ArrayList<Comando> bloco;
	
	public CIf(int linha,Exp exp, ArrayList<Comando> bloco)
	{
	  this.linha = linha;
	  this.exp = exp;
	  this.bloco = bloco;
	} 


	public void geraCodigo(PrintWriter out) {
		out.print("if (");
		exp.geraCodigo(out);
		out.println(") {");

		for (Comando comando : bloco) {
			comando.geraCodigo(out);
		}

		out.println("}");
	}
}
