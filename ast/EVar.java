package ast;
import java.io.PrintWriter;

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
