package ast;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main{

	public ArrayList<VarDecl> vars;
	public ArrayList<Comando> coms;
	
	public Main(ArrayList<VarDecl> vars,ArrayList<Comando> coms)
	{
		this.vars = vars;
		this.coms = coms;
	}

	public void geraCodigo(PrintWriter out) {
        out.println("int main() {");
        if (vars != null) {
            for (VarDecl var : vars) {
                var.geraCodigo(out);
            }
        }
        if (coms != null) {
            for (Comando comando : coms) {
                comando.geraCodigo(out);
            }
        }

        out.println("\treturn 0;");
        out.println("}");
    }

}
