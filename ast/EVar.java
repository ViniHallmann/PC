package ast;


public class EVar extends Exp{
	public String var;
	
	
	public EVar(String var)
	{
	  this.var = var;
	  
	}

	public void geraCodigo(PrintWriter out) {
    	out.print(var);
	}

}
