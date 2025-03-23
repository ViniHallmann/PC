package ast;
import java.io.PrintWriter;
import java.util.ArrayList;

public class EChamadaFun extends Exp{
	public String fun;
	public ArrayList<Exp> args;
	
	public EChamadaFun(String fun, ArrayList<Exp> args)
	{
	  this.fun = fun;
	  this.args = args;
	}

	public void geraCodigo(PrintWriter out) {
		out.print(fun + "(");
		if (args != null && !args.isEmpty()) {
			for (int i = 0; i < args.size(); i++) {
				args.get(i).geraCodigo(out);
				if (i < args.size() - 1) {
					out.print(", ");
				}
			}
		}
		out.print(")");
	}

}
