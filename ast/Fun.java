package ast;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Fun{
	public String nome;
	public ArrayList<ParamFormalFun> params;
	public String retorno;
	public ArrayList<VarDecl> vars;
	public ArrayList<Comando> body;
	
	public Fun(String nome,ArrayList<ParamFormalFun> params, String retorno,ArrayList<VarDecl> vars,ArrayList<Comando> body)
	{
		this.nome 	 = nome;
		this.params  = params;
		this.retorno = retorno;
		this.vars 	 = vars;
		this.body 	 = body;
	}

	public void geraCodigo(PrintWriter out) {
		out.print(retorno + " " + nome + "(");
		
		if (params != null && !params.isEmpty()) {
			for (int i = 0; i < params.size(); i++) {
				params.get(i).geraCodigo(out);
				if (i < params.size() - 1) {
					out.print(", ");
				}
			}
		}
		
		out.println(") {");

		if (vars != null) {
			for (VarDecl var : vars) {
				var.geraCodigo(out);
			}
		}
		
		if (body != null) {
			for (Comando comando : body) {
				comando.geraCodigo(out);
			}
		}
		
		out.println("}");
	}
}
