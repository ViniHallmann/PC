package ast;
import java.io.PrintWriter;

public class EOpExp extends Exp{
	public String op;
	public Exp arg1;
	public Exp arg2;
	
	
	public EOpExp(String op, Exp arg1, Exp arg2)
	{
	  this.op = op;
	  this.arg1 = arg1;
	  this.arg2 = arg2;
	  
	}

	public void geraCodigo(PrintWriter out) {
		arg1.geraCodigo(out);
		out.print(" " + op + " ");
		arg2.geraCodigo(out);
	}

}
