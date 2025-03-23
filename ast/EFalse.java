package ast;
import java.io.PrintWriter;

public class EFalse extends Exp{
	
	public EFalse()
	{
	  super();
	  
	}

	public void geraCodigo(PrintWriter out) {
		out.print("false");
	}

}
