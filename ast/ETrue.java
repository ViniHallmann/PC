package ast;
import java.io.PrintWriter;

public class ETrue extends Exp{
	
	public ETrue()
	{
	  super();
	  
	}
	public void geraCodigo(PrintWriter out) {
		out.print("true");
	}

}
