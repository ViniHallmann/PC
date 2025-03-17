package ast;


public class CAtribuicao extends Comando{
	public int linha;
	public String var;
	public Exp exp;
	
	public CAtribuicao(int linha,String var, Exp exp)
	{
	  this.linha = linha;	
	  this.var = var;
	  this.exp = exp;
	} 

	public void geraCodigo(PrintWriter out) {
    out.print(var + " = ");
    exp.geraCodigo(out);
    out.println(";");
}

}
